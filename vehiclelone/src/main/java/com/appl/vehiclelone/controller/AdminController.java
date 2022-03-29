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

import com.appl.vehiclelone.bean.Admin;

import com.appl.vehiclelone.services.AdminService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	//http://localhost:8090/admin/admins
			@GetMapping("/admins")
			public List<Admin> listAllAdminList()
			{
				return adminService.listAllAdmin();
			}
	
			//http://localhost:8090/admin/adminid/1001
		    @GetMapping("/adminid/{id}")
			public Admin getAdminById(@PathVariable(value="id") int adminId)
			{
				//System.out.println("inside controller");
			return adminService.getAdminById(adminId);
			}	
		    
		    
		  //http://localhost:8090/admin/addAdmin
		    @PostMapping("/addAdmin")
		    public void  addAdmin(@RequestBody Admin a)
		   {
			  adminService.addAdmin(a);
		   }
	

}
