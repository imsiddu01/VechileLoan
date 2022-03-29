package com.appl.vehiclelone.dao;

import java.util.List;

import com.appl.vehiclelone.bean.Admin;


public interface AdminDao {
	
	public abstract Admin getAdminById(int adminId);

	public abstract List<Admin> listAllAdmin();
	
	public abstract void addAdmin(Admin a);


}
