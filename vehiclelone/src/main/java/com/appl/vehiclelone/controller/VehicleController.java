package com.appl.vehiclelone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.appl.vehiclelone.bean.Vehicle;

import com.appl.vehiclelone.exception.CustomVehicleException;
import com.appl.vehiclelone.services.VehicleService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	
	@Autowired
	VehicleService vehicleService;
	
	//http://localhost:8090/vehicle/vehicles
			@GetMapping("/vehicles")
			public List<Vehicle> listAllVehicleList()
			{
				return vehicleService.listAllVehicle();
			}
			
			//http://localhost:8090/vehicle/addVehicle
			@PostMapping("/addVehicle")
		    public void  addVehicle(@RequestBody Vehicle v)
		   {
				vehicleService.addVehicle(v);
		   }
			
			
			//http://localhost:8090/vehicle/vehicleId/KA02BM1020
		    @GetMapping("/vehicleId/{id}")
			public Vehicle getVehicleById(@PathVariable(value="id") String vehicleNo) throws CustomVehicleException
			{
				//System.out.println("inside controller");
			return vehicleService.getVehicleById(vehicleNo);
			}	


}
