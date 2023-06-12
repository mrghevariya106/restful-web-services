package com.maylearn.rest.webservices.restfulwebservices.users;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@GetMapping("/users/{id}")
	public Users findUser(@PathVariable Integer id) {
		Users user = service.findUser(id);
		if(user == null)
			throw new UserNotFoundException("id:"+id);
		return user;
	}

	@PostMapping("/users")
	public void creatUser(@RequestBody Users user) {
		service.save(user);
	}
	
	@PostMapping("/user")
	public ResponseEntity<Object> saveUserDyn(@RequestBody Users user) {
		Users savedUser = service.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("s/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
