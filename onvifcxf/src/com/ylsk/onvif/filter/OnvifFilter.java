package com.ylsk.onvif.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OnvifFilter implements Filter
{

	@SuppressWarnings("unused")
	private ServletContext servletContext = null;

	@Override
	public void destroy()
	{
		// TODO Auto-generated method stub

	}

	/**
	 * 过滤处理
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException
	{		
		System.out.println("============= OnvifFilter - doFilter ===============");
		
		// 正确的做法
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		boolean isStatic = false;
		
		String servletPath = httpRequest.getServletPath();
		if(servletPath.contains("/device_service"))
		{
			isStatic = true;
		}
		
		if(isStatic)
		{
			// 过滤处理
			OnvifResponseWrapper responseWrapper = new OnvifResponseWrapper((HttpServletResponse) response);
			filterChain.doFilter(request, responseWrapper);
			
			String responseText = responseWrapper.getResult();
			int contentlength = responseText.getBytes("utf-8").length;
			
			System.out.println("length:"+contentlength+" -- \r\n" + responseText);
			
			response.setContentLength(contentlength);
			response.getWriter().write(responseText);
			response.getWriter().flush();
		}
		else
		{
			// 默认处理
			filterChain.doFilter(request, response);
		}
	}

	/**
	 * 保存过滤器的初始化配置信息
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		servletContext = filterConfig.getServletContext();
	}

}
