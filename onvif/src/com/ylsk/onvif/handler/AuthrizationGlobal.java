package com.ylsk.onvif.handler;

/**
 * 全局授权模式配置管理类
 * @author gsj
 *
 */
public class AuthrizationGlobal
{
	// 模式1：不进行认证
	@SuppressWarnings("unused")
	private static final int MODE_NONE = 0;
	// 模式2：用户名密码认证
	private static final int MODE_WS_USERNAME_TOKEN = 1;
	// 模式3：数字摘要认证
	@SuppressWarnings("unused")
	private static final int MODE_DIGEST = 2;

	///////////////////////////////////////////////////////////////////////////
	// 以下模式，3选1
	///////////////////////////////////////////////////////////////////////////
	// 授权模式1 - 配合web-NONE-temple.xml使用
	//private static int authrizationMode = MODE_NONE;
	
	// 授权模式2 - 配合web-USERNAMETOKEN-temple.xml使用
	private static int authrizationMode = MODE_WS_USERNAME_TOKEN;
	// 配合模式2使用
	public static String username = "adminonvif";
	public static String password = "adminonvif";
	
	// 授权模式3 - 配合web-digest-temple.xml使用
	// 注意，此时的用户名密码需要在tomcat中进行配置：
	//   <role rolename="onvif"/>
	//   <user username="adminonvif" password="adminonvif" roles="onvif"/>
	//private static int authrizationMode = MODE_DIGEST;
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * 获取认证模式
	 * @return
	 */
	public static boolean getMode()
	{	
		return (authrizationMode == MODE_WS_USERNAME_TOKEN)?true:false;
	}
}
