package com.appl.vehiclelone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appl.vehiclelone.bean.User;
import com.appl.vehiclelone.dao.UserDaoImpl;
import com.appl.vehiclelone.exception.CustomUserException;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDaoImpl dao;
	

	public UserDaoImpl getDao() {
		return dao;
	}

	public void setDao(UserDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public void addUser(User u) {
		System.out.println("inside service layer");
		 dao.addUser(u);	
		
	}
	
	

	@Override
	public List<User> listAllUser() {
		System.out.println("inside service layer");
		List<User> userList = dao.listAllUser();
		return userList;
		
		
	}

	@Override
	public User getUserById(int userId) throws CustomUserException {
		// TODO Auto-generated method stub
		User userlist=dao.getUserById(userId);
		System.out.println("service side\n" + userlist);
		return userlist;
	}

	

}
