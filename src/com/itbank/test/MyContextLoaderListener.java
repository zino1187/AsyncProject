package com.itbank.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextLoaderListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("���ø����̼��� ����ǳ׿�");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("���ø����̼��� �ʱ�ȭ �ǳ׿�");
		String param=sce.getServletContext().getInitParameter("contextConfigLocation");
		System.out.println(param);
	}
	
}
