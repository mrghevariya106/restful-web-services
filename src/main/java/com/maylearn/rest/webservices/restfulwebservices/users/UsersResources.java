package com.maylearn.rest.webservices.restfulwebservices.users;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersResources {
	
	private UsersDaoServices service;
	
	public UsersResources(UsersDaoServices service) {
		this.service = service;
	}
	
	@GetMapping("/users")
	public List<Users> retriveAllUsers(){
		return service.finaAll();
	}
}
