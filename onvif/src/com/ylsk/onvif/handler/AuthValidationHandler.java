/**
 * 验证处理器
 */
package com.ylsk.onvif.handler;

import java.security.NoSuchAlgorithmException;
import java.util.*;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.*;
import javax.xml.ws.soap.SOAPFaultException;

import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.NodeList;

/**
 * 验证处理器
 * @author gsj
 *
 */
public class AuthValidationHandler implements SOAPHandler<SOAPMessageContext>
{
	/**
	 * 获取头信息
	 */
	public Set<QName> getHeaders()
	{
		// 返回null的话处理所有信息
		System.out.println("AuthValidationHandler.getHeaders()");
		return null;
	}

	/**
	 * 关闭
	 */
	public void close(MessageContext context)
	{
		System.out.println("AuthValidationHandler.close()");
	}

	/**
	 * 处理错误
	 */
	public boolean handleFault(SOAPMessageContext context)
	{
		System.out.println("AuthValidationHandler.handleFault()");
		return false;
	}

	/**
	 * 处理in类型的消息
	 */
	public boolean handleMessage(SOAPMessageContext context)
	{
		// 是否启用UsernameToken验证方式 true-启用，false-不启用
		boolean usernameTokenflag = false;
		usernameTokenflag = AuthrizationGlobal.getMode();
		if(!usernameTokenflag)
		{
			// 如果不启用UsernameToken验证模式，直接返回true。
			return true;
		}
		// 校验是 in 还是 out类型的message
		Boolean outbound;
		outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		// 如果是in类型的message
		if (!outbound.booleanValue())
		{
			// 获取soap消息
			SOAPMessage soapMessage;
			soapMessage = context.getMessage();

			int errorType = 0;
			try
			{
				System.out.println("!!--------------------------------------------------------------------------");
				// 输出soapMessage到控制台
				soapMessage.writeTo(System.out);
				System.out.println("\r\n!!--------------------------------------------------------------------------");
				
				SOAPEnvelope soapEnvelope;
				soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
											
				SOAPHeader soapHeader;
				soapHeader = soapEnvelope.getHeader();

				if (soapHeader == null)
				{
					//generateSoapFault(soapMessage, "No Message Header...");
					System.out.println("没有头信息!!!!!!!!!!!!!!!!!!!!!!!!!!");
				}
				System.out.println("Header: \r\n" +soapHeader.getNamespaceURI());
				
				// 文本内容可以打印出来
				String str = soapHeader.getTextContent();
				System.out.println("头结点名称：   " + str);
				
				NodeList nlSecurity = soapHeader.getElementsByTagName("wsse:Security");
				org.w3c.dom.Node securityNode = nlSecurity.item(0);
				
				NodeList nlUsernameToken = securityNode.getChildNodes();
				org.w3c.dom.Node usernameTokenNode = nlUsernameToken.item(0);
				
				NodeList valuesNode = usernameTokenNode.getChildNodes();
				
				Hashtable<String,String> hs = new Hashtable<String, String>();
				for(int i=0; i<valuesNode.getLength(); i++)
				{
					org.w3c.dom.Node n = valuesNode.item(i);
					String nodename = n.getNodeName();
					String nodevalue = n.getTextContent();
					hs.put(nodename, nodevalue);
					System.out.println(nodename + "=" + nodevalue);
				}
				
				// 校验
				boolean ret = validateInfo(hs);
				System.out.println("校验结果: " + ret);
				if(ret == true)
				{
					return true;
				}
				
				errorType = 1;
			}
			catch(Exception ex)
			{
				generateSoapFault(soapMessage, "Sender not Authorized(其他错误-验证类型不正确：请使用UsernameToken方式验证 ！)");
			}
			
			if(errorType == 1)
			{
				//生成错误信息
				generateSoapFault(soapMessage, "Sender not Authorized(用户名密码错误！)");
			}
			else
			{
				generateSoapFault(soapMessage, "Sender not Authorized(其他错误-未知错误 ！)");
			}
		}
		
		return false;
	}

	/**
	 * @throws NoSuchAlgorithmException 
	 * 校验用户信息
	 * @param hs 验证信息哈希表
	 * @return true-通过验证，false-验证失败
	 * @throws 只支持SHA1算法
	 */
	private boolean validateInfo(Hashtable<String, String> hs) throws NoSuchAlgorithmException
	{
		//String serverUsername = "adminonvif";
		//String serverPassword = "adminonvif";
		String serverUsername = AuthrizationGlobal.username;
		String serverPassword = AuthrizationGlobal.password;
		
		String clientUsername = hs.get("wsse:Username");
		String clientPasswordDigest = hs.get("wsse:Password");
		String clientNonce = hs.get("wsse:Nonce");
		String clientCreated = hs.get("wsu:Created");
		
		if(serverUsername.trim().equals(clientUsername.trim()))
		{
			System.out.println("用户名匹配！ ....继续验证密码......");
		
			byte[] noncebytes = Base64.decodeBase64(clientNonce);
			byte[] datebytes = clientCreated.getBytes();
			byte[] passwordbytes = serverPassword.getBytes();
			
			// 1. SHA-1加密实例对象
			java.security.MessageDigest alga=java.security.MessageDigest.getInstance("SHA-1");
			// 2. 添加要进行计算摘要的信息
			alga.update(noncebytes);
			alga.update(datebytes);
			alga.update(passwordbytes);
			// 3. 计算出摘要
			byte[] digesta=alga.digest();
			// 4. B64编码
			String expectdigest = Base64.encodeBase64String(digesta);
			System.out.println("服务端计算出的密码摘要："+expectdigest);
			System.out.println("客户端给出的    密码摘要："+clientPasswordDigest);
			
			// 比较密码
			if(expectdigest.equals(clientPasswordDigest))
			{
				// 验证身份通过
				return true;
			}
		}
		
		// 验证失败
		return false;
	}

	/**
	 * 验证用户名和密码
	 * @param userName
	 * @param password
	 * @return
	 */
	@SuppressWarnings("unused")
	private boolean authValidate(String userName, String password)
	{
		System.out.println("AuthValidationHandler.authValidate()");
		
		if (userName == null || password == null)
		{
			return false;
		}

		if ("admin".equals(userName) && "admin".equals(password))
		{
			return true;
		}
		
		return false;
	}

	/**
	 * 生成错误信息
	 * @param soapMessage
	 * @param reasion
	 */
	private void generateSoapFault(SOAPMessage soapMessage, String reasion)
	{
		System.out.println("AuthValidationHandler.generateSoapFault()");
		try
		{
//			SOAPBody soapBody = soapMessage.getSOAPBody();
//			SOAPFault soapFault = soapBody.getFault();
//
//			if (soapFault == null)
//			{
//				soapFault = soapBody.addFault();
//			}
			
			SOAPFactory soapfc = SOAPFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
			SOAPFault soapFault = soapfc.createFault();
			
			soapFault.setFaultString(reasion);

			throw new SOAPFaultException(soapFault);

		}
		catch (SOAPException e)
		{
			e.printStackTrace();
		}
	}
}
