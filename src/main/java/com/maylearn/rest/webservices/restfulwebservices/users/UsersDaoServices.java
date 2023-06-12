package com.maylearn.rest.webservices.restfulwebservices.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UsersDaoServices {

	private static List<Users> users = new ArrayList<>();
	private static int countIdPlus = 0;

	static {
		users.add(new Users(++countIdPlus, "May", LocalDate.now().minusYears(25)));
		users.add(new Users(++countIdPlus, "Shivani", LocalDate.now().minusYears(24)));
		users.add(new Users(++countIdPlus, "Shivalik", LocalDate.now().minusYears(1)));
	}

	public List<Users> finaAll() {
		return users;
	}

	public Users findUser(Integer id) {
		Predicate<? super Users> predicate = users -> users.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public Users save(Users user) {
		user.setId(++countIdPlus);
		users.add(user);
		return user;
	}

	public void deleteUserById(Integer id) {
		Predicate<? super Users> predicate = users -> users.getId().equals(id);
		users.removeIf(predicate);
	}
}
