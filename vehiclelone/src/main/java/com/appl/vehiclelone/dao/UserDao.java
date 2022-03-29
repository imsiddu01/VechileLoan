package com.appl.vehiclelone.dao;

import java.util.List;

import com.appl.vehiclelone.bean.User;
import com.appl.vehiclelone.exception.CustomUserException;



public interface UserDao {
	

	
	
	public abstract List<User> listAllUser();
	public abstract User getUserById(int userId) throws CustomUserException;
	public abstract void addUser(User u);
	


	

}
