package cn.itcast.servlet.hello;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AServlet implements Servlet {
	private ServletConfig config;
	// init 是在第一次请求AServlet时调用.==> servlet实例的创建是在第一次访问的时候
	// servlet在多次访问时,发现只调用了1次init方法.在多次访问,只创建了一个实例
	public void init(ServletConfig arg0) throws ServletException {
		this.config = arg0;
		System.out.println("AServlet的init方法被调用了.");
	}
	// 当客服端请求的时候调用service , 参数1 request 对象封装了 请求信息.参数2response 中填入信息生成响应.
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		arg1.getWriter().print("hello world!");
		System.out.println("AServlet的service方法被调用了.");
	
	}
	// 在服务器将要关闭时,会销毁内存中的servlet实例. 在销毁之前会调用destroy方法.
	public void destroy() {
		System.out.println("AServlet的destroy方法被调用了.");
	}
	
	
	
	
	
	
	
	
	
	
	//这个方法,没有用
	public String getServletInfo() {
		return "1.0/lyd";
	}
	//获得servletconfig对象.
	public ServletConfig getServletConfig() {
		return config;
	}


}
