package com.maylearn.rest.webservices.restfulwebservices.users;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class Users {

	private Integer id;

	@Size(min=2, message = "Name should have atleast 2 characters")
	private String name;

	@Past(message = "Birthdate should be in past")
	private LocalDate dateOfBirth;

	public Users(Integer id, String name, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
