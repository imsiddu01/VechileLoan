package com.appl.vehiclelone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.appl.vehiclelone.bean.Vehicle;
import com.appl.vehiclelone.exception.CustomUserException;
import com.appl.vehiclelone.exception.CustomVehicleException;

@Repository
public class VehicleDaoImpl implements VehicleDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Vehicle> listAllVehicle() {
		String sql= "select v From Vehicle v ";
		Query qry = em.createQuery(sql);
		List<Vehicle> vehicleList=qry.getResultList();
		System.out.println("on db server" +vehicleList);
			return vehicleList;
	}

	@Override
	@Transactional
	public void addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		System.out.println("dao layer");
		em.persist(v);
		
	}

	@Override
	@Transactional
	public Vehicle getVehicleById(String vehicleNo) throws CustomVehicleException {
		Vehicle vehiclelist=em.find(Vehicle.class, vehicleNo);
		//System.out.println("dao side\n"+ vehiclelist);
		if(vehiclelist!=null)
		{
			vehiclelist.setVehNo(vehicleNo);
			em.merge(vehiclelist);
			return vehiclelist;
		}
		else
		{
			throw new CustomVehicleException("Vehicle Doesnot Exist");
		}
		
	}

}
