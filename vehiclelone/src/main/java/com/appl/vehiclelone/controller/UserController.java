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

import com.appl.vehiclelone.bean.User;
import com.appl.vehiclelone.exception.CustomUserException;
import com.appl.vehiclelone.services.UserServiceImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	

	//http://localhost:8090/user/userid/101
    @GetMapping("/userid/{id}")
	public User getUserById(@PathVariable(value="id") int userId) throws CustomUserException
	{
		//System.out.println("inside controller");
	return userService.getUserById(userId);
	}	

	
	//http://localhost:8090/user/users
		@GetMapping("/users")
		public List<User> listAllUserList()
		{
			return userService.listAllUser();
		}
		
		//http://localhost:8090/user/addUser
		@PostMapping("/addUser")
	    public void  addUser(@RequestBody User u)
	   {
		  userService.addUser(u);
	   }
		
		
}
