package com.appl.vehiclelone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appl.vehiclelone.bean.Admin;

import com.appl.vehiclelone.dao.AdminDaoImpl;


@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	
	@Autowired
	AdminDaoImpl dao;
	

	public AdminDaoImpl getDao() {
		return dao;
	}

	public void setDao(AdminDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public Admin getAdminById(int adminId) {
		// TODO Auto-generated method stub
		Admin adminlist = dao.getAdminById(adminId);
		System.out.println("service side\n" + adminlist);
		return adminlist;
		
		
	}

	@Override
	public List<Admin> listAllAdmin() {
		// TODO Auto-generated method stub
		System.out.println("inside service layer");
		List<Admin> adminList = dao.listAllAdmin();
		return adminList;
		
		
	}

	@Override
	public void addAdmin(Admin a) {
		// TODO Auto-generated method stub
		System.out.println("inside service layer");
		 dao.addAdmin(a);	
		
	}

}
