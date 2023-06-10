package com.maylearn.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping(path="/hello-may")
	public String helloMay() {
		return "Hello May!";
	}
	
	@GetMapping(path="/hello-shivalik")
	public HelloShivalikBean helloShivalikBean() {
		return new HelloShivalikBean("Hello Shivalik!");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloShivalikBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloShivalikBean(String.format("Hello World, %s", name));
	}
}
