package com.itbank.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.commons.exception.ExistFailException;
import com.itbank.model.domain.Admin;
import com.itbank.model.repository.AdminDAO;

@Service
public class JdbcAdminService implements AdminService{
	@Autowired
	private AdminDAO adminDAO;
	
	
	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin select(int admin_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin loginCheck(Admin admin) throws ExistFailException{
		
		Admin obj=null;
		obj=adminDAO.loginCheck(admin);
		if(obj == null) {
			throw new ExistFailException("일치하는 정보가 없습니다");
		}
		
		return obj;
	}

	@Override
	public void insert(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int admin_id) {
		// TODO Auto-generated method stub
		
	}
	
}
