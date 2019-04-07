package com.itbank.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextLoaderListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("어플리케이션이 종료되네요");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("어플리케이션이 초기화 되네요");
		String param=sce.getServletContext().getInitParameter("contextConfigLocation");
		System.out.println(param);
	}
	
}
