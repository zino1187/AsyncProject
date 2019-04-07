package com.itbank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itbank.model.domain.Admin;
import com.itbank.model.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/admin/main", method=RequestMethod.GET)
	public String main(HttpServletRequest request){
		return "admin/index";
	}
	@RequestMapping(value="/admin/member", method=RequestMethod.GET)
	public String member(){
		return "admin/member/index";
	}
	@RequestMapping(value="/admin/map", method=RequestMethod.GET)
	public String map(){
		return "admin/map/index";
	}
	
	@RequestMapping(value="/admin/login", method=RequestMethod.POST)
	public String adminLogin(Admin admin, HttpServletRequest request) {
		System.out.println("테스트 성공");
		
		Admin obj=null;
		
		obj=adminService.loginCheck(admin);
		
		if(obj !=null) {
			request.getSession().setAttribute("admin", admin);
		}
		return "redirect:/admin/main";
	}
	
	
}
