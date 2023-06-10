package com.maylearn.rest.webservices.restfulwebservices.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UsersDaoServices {

	
	private static List<Users> users = new ArrayList<>();
	
	static {
		users.add(new Users(1,"May",LocalDate.now().minusYears(25)));
		users.add(new Users(2,"Shivani",LocalDate.now().minusYears(24)));
		users.add(new Users(3,"Shivalik",LocalDate.now().minusYears(1)));
	}
	
	public List<Users> finaAll() {
		return users;
	}
}
