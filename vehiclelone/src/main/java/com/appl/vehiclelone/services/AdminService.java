package com.appl.vehiclelone.services;

import java.util.List;

import com.appl.vehiclelone.bean.Admin;


public interface AdminService {

	public abstract Admin getAdminById(int adminId);

	public abstract List<Admin> listAllAdmin();

	public abstract void addAdmin(Admin a);

	
}
