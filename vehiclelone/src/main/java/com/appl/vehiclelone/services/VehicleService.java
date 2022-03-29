package com.appl.vehiclelone.services;

import java.util.List;

import com.appl.vehiclelone.bean.Vehicle;
import com.appl.vehiclelone.exception.CustomVehicleException;

public interface VehicleService {

	public abstract List<Vehicle> listAllVehicle();

	public abstract void addVehicle(Vehicle v);

	public abstract Vehicle getVehicleById(String vehicleNo) throws CustomVehicleException;

}
