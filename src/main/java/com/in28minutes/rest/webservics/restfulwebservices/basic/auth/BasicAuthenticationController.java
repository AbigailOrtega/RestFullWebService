package com.in28minutes.rest.webservics.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean() {
		//throw new RuntimeException("Some Error has Happended! Contact Support at ****_***");
		return new AuthenticationBean("You are authenitcated");
	}
	
	
}
