package com.itbank.test;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.servlet.ModelAndView;

@Aspect
public class SoundEffect {
	@Pointcut("execution(public * com.itbank.controller.AdminController..main*(..))")
	public void loginCut() {}
	
	
	@Around("loginCut()")
	public String bell(ProceedingJoinPoint joinPoint) {
		String viewName=null;
		
		System.out.println("딩동 시작");
		
		Object[] obj=joinPoint.getArgs();
		HttpServletRequest request= null;
		
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
			if(obj[i] instanceof HttpServletRequest) {
				System.out.println("request object detected !!");
				request=(HttpServletRequest)obj[i];
			}
		}
		
		if(request.getSession().getAttribute("admin")==null) {
			viewName="redirect:/error/err.jsp";
		}else {
			try {
				joinPoint.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
			viewName="admin/main";
		}
		
		System.out.println("딩동 종료");
		
		return viewName;
	}
	
	public void trumpet() {
		System.out.println("빰빠라");
	}
}
