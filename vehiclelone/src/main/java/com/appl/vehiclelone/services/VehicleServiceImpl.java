package com.appl.vehiclelone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.appl.vehiclelone.bean.Vehicle;

import com.appl.vehiclelone.dao.VehicleDaoImpl;
import com.appl.vehiclelone.exception.CustomVehicleException;


@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	VehicleDaoImpl dao;
	
	

	public VehicleDaoImpl getDao() {
		return dao;
	}

	public void setDao(VehicleDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public List<Vehicle> listAllVehicle() {
		// TODO Auto-generated method stub
		System.out.println("inside service layer");
		List<Vehicle> vehicleList = dao.listAllVehicle();
		return vehicleList;
		
		
	}

	@Override
	public void addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		System.out.println("inside service layer");
		 dao.addVehicle(v);
		
	}

	@Override
	public Vehicle getVehicleById(String vehicleNo) throws CustomVehicleException{
		// TODO Auto-generated method stub
		Vehicle vehiclelist=dao.getVehicleById(vehicleNo);
		//System.out.println("service side\n" + vehiclelist);
		return vehiclelist;
	}
	

}
