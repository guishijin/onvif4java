/**
 * 自己实现ServletOutputStream
 */
package com.ylsk.onvif.filter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;

/**
 * @author gsj
 *
 */
public class OnvifServletOutputStream extends ServletOutputStream
{
	private String filePathName;
	
	/**
	 * 扩展支持的输出流
	 */
	private FileOutputStream fileOutputStream;

	// 内容长度
	private int contentLength;

	private String result;

	/**
	 * 构造函数
	 * @throws FileNotFoundException 
	 */
	public OnvifServletOutputStream() throws FileNotFoundException
	{
		super();
		
		filePathName = "D:\\onviftemp\\"+System.nanoTime()+".xml";
		fileOutputStream = new FileOutputStream(this.filePathName);
	}

	//-------------------------------------------------------------------------
	// ServletOutputStream 抽象方法实现(start)

	@Override
	public void print(boolean b) throws IOException
	{
		System.out.println("*** 1 - print(boolean b)");
		// TODO Auto-generated method stub
		super.print(b);
	}




	@Override
	public void print(char c) throws IOException
	{
		System.out.println("*** 2 - print(char c)");
		// TODO Auto-generated method stub
		super.print(c);
	}




	@Override
	public void print(double d) throws IOException
	{
		System.out.println("*** 3 - print(double d)");
		// TODO Auto-generated method stub
		super.print(d);
	}




	@Override
	public void print(float f) throws IOException
	{
		System.out.println("*** 4 - print(float f)");
		// TODO Auto-generated method stub
		super.print(f);
	}




	@Override
	public void print(int i) throws IOException
	{
		System.out.println("*** 5 - print(int i)");
		// TODO Auto-generated method stub
		super.print(i);
	}




	@Override
	public void print(long l) throws IOException
	{
		System.out.println("*** 6 - print(long l)");
		// TODO Auto-generated method stub
		super.print(l);
	}




	@Override
	public void print(String s) throws IOException
	{
		System.out.println("*** 7 - print(String s)");
		// TODO Auto-generated method stub
		super.print(s);
	}




	@Override
	public void println() throws IOException
	{
		System.out.println("*** 8 - println()");
		// TODO Auto-generated method stub
		super.println();
	}




	@Override
	public void println(boolean b) throws IOException
	{
		System.out.println("*** 9 - println(boolean b)");
		// TODO Auto-generated method stub
		super.println(b);
	}




	@Override
	public void println(char c) throws IOException
	{
		System.out.println("*** 10 - println(char c)");
		// TODO Auto-generated method stub
		super.println(c);
	}




	@Override
	public void println(double d) throws IOException
	{
		System.out.println("*** 11 - println(double d)");
		// TODO Auto-generated method stub
		super.println(d);
	}




	@Override
	public void println(float f) throws IOException
	{
		System.out.println("*** 12 - println(float f)");
		// TODO Auto-generated method stub
		super.println(f);
	}




	@Override
	public void println(int i) throws IOException
	{
		System.out.println("*** 13 - println(int i)");
		// TODO Auto-generated method stub
		super.println(i);
	}




	@Override
	public void println(long l) throws IOException
	{
		System.out.println("*** 14 - println(long l)");
		// TODO Auto-generated method stub
		super.println(l);
	}




	@Override
	public void println(String s) throws IOException
	{
		System.out.println("*** 15 - println(Sring s)");
		// TODO Auto-generated method stub
		super.println(s);
	}
	
	// ServletOutputStream 抽象方法实现(end)
	//-------------------------------------------------------------------------
	

	//-------------------------------------------------------------------------
	// OutputStream接口实现
	
	/**
	 * 
	 * 
	 */
	@Override
	public void write(int b) throws IOException
	{
		fileOutputStream.write(b);
	}
	
	@Override
	public void write(byte[] b) throws IOException
	{
		System.out.println("*** 16 - write(byte[] b)");
		//super.write(b);
		this.fileOutputStream.write(b);
	}


	@Override
	public void write(byte[] b, int off, int len) throws IOException
	{
		System.out.println("*** 17 - write(byte[] b, int off, int len)");
		//super.write(b, off, len);
		this.fileOutputStream.write(b, off, len);
	}


	@Override
	public void flush() throws IOException
	{
		System.out.println("*** 18 - flush()");
		//super.flush();
		this.fileOutputStream.flush();
	}


	@Override
	public void close() throws IOException
	{
		System.out.println("*** 19 - close()");
		//super.close();
		this.fileOutputStream.close();
		
		FileInputStream fis;
		fis = new FileInputStream(this.filePathName);
		this.contentLength = fis.available();
		byte[] buf = new byte[this.contentLength];
		fis.read(buf);
		fis.close();
		this.result = new String(buf,"utf-8");
	}

	/**
	 * 获取内容长度
	 * @return
	 */
	public int getContentLength()
	{		
		return this.contentLength;
	}

	/**
	 * 获取结果
	 * @return
	 */
	public String getResult()
	{
		return this.result;
	}
	
	//-------------------------------------------------------------------------
	

}
