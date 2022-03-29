package com.appl.vehiclelone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.appl.vehiclelone.bean.Admin;


@Repository
public class AdminDaoImpl implements AdminDao {
	
	
	@PersistenceContext
	private EntityManager em;
	
	

	@Override
	public Admin getAdminById(int adminId) {
		// TODO Auto-generated method stub
		Admin adminlist=em.find(Admin.class, adminId);
		System.out.println("dao side\n"+ adminlist);
		return adminlist;
		
	}

	@Override
	public List<Admin> listAllAdmin() {
		// TODO Auto-generated method stub
		String sql= "select a From Admin a ";
		Query qry = em.createQuery(sql);
		List<Admin> adminList=qry.getResultList();
		System.out.println("on db server" +adminList);
			return adminList;
	}

	@Override
	@Transactional
	public void addAdmin(Admin a) {
		System.out.println("dao layer");
		em.persist(a);
		
	}

	
}
