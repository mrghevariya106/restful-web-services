package com.maylearn.rest.webservices.restfulwebservices.helloWorld;


public class HelloShivalikBean {

	private String message;

	public HelloShivalikBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloShivalikBean [message=" + message + "]";
	}
	

}
