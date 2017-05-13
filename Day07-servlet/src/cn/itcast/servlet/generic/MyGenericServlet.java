package cn.itcast.servlet.generic;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class MyGenericServlet implements Servlet, ServletConfig {

	private ServletConfig config;

	public ServletConfig getServletConfig() {
		return config;
	}


	public String getServletInfo() {
		return "";
	}

	public void init(ServletConfig arg0) throws ServletException {
		//
		this.config = arg0;
		//子类直接重写 接口中的init的方法会把this.config = arg0; 代码覆盖,所以要提供一个空参init方法用来初始化动作.
		this.init();
	}

	public void init() {
	}
	//service方法处理业务,生命为抽象,子类自己实现
	public abstract void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException;

	public void destroy() {

	}

	//实现servletConfig中的方法
	public String getInitParameter(String arg0) {
		return getServletConfig().getInitParameter(arg0);
	}

	public Enumeration getInitParameterNames() {
		return getServletConfig().getInitParameterNames();
	}

	public ServletContext getServletContext() {
		return getServletConfig().getServletContext();
	}

	public String getServletName() {
		return getServletConfig().getServletName();
	}

}
