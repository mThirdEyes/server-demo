package cn.itcast.servlet.generic;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CServlet  extends MyGenericServlet {
	
	

	/*@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("啦啦,初始化资源!!");
	}*/
	
	

	@Override
	
	
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		String servletName = getServletName();
		
		arg1.getWriter().print(servletName);
	}

	@Override
	public void init() {
		System.out.println("这是CServlet的 初始化方法!");
	}

}
