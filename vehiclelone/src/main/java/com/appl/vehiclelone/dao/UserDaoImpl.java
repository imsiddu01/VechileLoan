package com.appl.vehiclelone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.appl.vehiclelone.bean.User;
import com.appl.vehiclelone.exception.CustomUserException;

@Repository
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager em;
	
	

	
	@Override
	@Transactional
	public void addUser(User u) {
		System.out.println("dao layer");
		em.persist(u);
		// u.getUserId();
		
	}
	
	

	@Override
	public List<User> listAllUser() {
		
		String sql= "select u From User u ";
		Query qry = em.createQuery(sql);
		List<User> userList=qry.getResultList();
		System.out.println("on db server" +userList);
			return userList;
		
	}

	@Override
	@Transactional
	public User getUserById(int userId) throws CustomUserException
	{

		User userlist=em.find(User.class, userId);
		//System.out.println("dao side\n"+ userlist);
		if(userlist!=null)
		{
			userlist.setUserId(userId);
			em.merge(userlist);
			return userlist;
		}
		else
		{
			throw new CustomUserException("User Doesnot Exist");
		}
		
		
	}

	

}
