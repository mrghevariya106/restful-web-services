package com.maylearn.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET, path="/hello-world")
	public String HelloWorld() {
		return "Hello World!";
	}
	
	@GetMapping(path="/hello-may")
	public String HelloMay() {
		return "Hello May!";
	}
}
