/**
 * Onvif的SOAP回应，增加Content-Length处理
 * 处理机制：
 * 	1、使用过滤器拦截所有/onvif的url
 *  2、使用HttpServletResponseWrapper对原始的response进行封装。
 *  3、然后使用封装后的response对象传递给其他的filter进行处理。
 *  4、处理后，讲内容和长度再想原始的resposne回应。
 */
package com.ylsk.onvif.filter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * @author gsj
 * 
 */
public class OnvifResponseWrapper extends HttpServletResponseWrapper
{
	/**
	 * 我们自己定义的writer，用于接收处理后的输出流
	 */
	private StringWriter output;
	
	/**
	 * 自定义的输出流
	 */
	OnvifServletOutputStream sos;
	
	/**
	 * 典型的装饰器模式
	 * 
	 * @param response
	 * @throws FileNotFoundException 
	 */
	public OnvifResponseWrapper(HttpServletResponse response) throws FileNotFoundException
	{
		super(response);
		
		// 实例化自己的数据接收对象
		output = new StringWriter();
		
	}

	//-------------------------------------------------------------------------
	/**
	 * 重载1
	 */
	@Override
	public PrintWriter getWriter()
	{
		// 当servlet或jsp请求输出流时，并不给它真正的response中的writer,而是给它我们自己定义的writer
		System.out.println("1-OnvifResponseWrapper.getWriter");
		return new PrintWriter(output);
	}

	
	/**
	 * 重载2
	 */
	@Override
	public ServletOutputStream getOutputStream() throws IOException
	{
		System.out.println("2-OnvifResponseWrapper.getOutputStream");
		//return super.getOutputStream();
		//return this.fileOutputStream;
		//ServletOutputStream sos;
		sos = new OnvifServletOutputStream();
		return sos;
	}

	/**
	 * 重载3
	 */
	@Override
	public ServletResponse getResponse()
	{
		System.out.println("3-OnvifResponseWrapper.getResponse");
		return super.getResponse();
	}

	//-------------------------------------------------------------------------
	
	/**
	 * 
	 * 返回流中的内容，方法叫什么名都可以。
	 * 
	 * @return
	 */
	public String getResult()
	{
		if(output.toString().length() > 0)
		{
			return output.toString();
		}
		else
		{
			int cl = this.sos.getContentLength();
			if(cl > 0)
			{
				return this.sos.getResult();
			}
			return "";
		}
	}
}
