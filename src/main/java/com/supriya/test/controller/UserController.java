package com.supriya.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.supriya.model.UserDetails;
import com.supriya.service.UserDataServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserDataServiceImpl userDataServiceImpl;
	
	@PostMapping("/addUser")
	public UserDetails addUser(@RequestBody  UserDetails userDetails) {
		
		
		return userDataServiceImpl.addData(userDetails);
	}
	
	@PostMapping("/updateUser")	
public String updateUser(String userDetails) {
		
		
		return "";
	}

	@GetMapping("/findUser")
public String findUser(String userDetails) {
	
	
	return "";
}

	@GetMapping("/findAllUser")
public String findAllUser() {
	
	
	return "";
}

}
