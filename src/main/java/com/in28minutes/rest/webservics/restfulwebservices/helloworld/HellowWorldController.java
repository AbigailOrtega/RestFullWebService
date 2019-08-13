package com.in28minutes.rest.webservics.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HellowWorldController {
	
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HellowWorldBean helloWorldBean() {
		//throw new RuntimeException("Some Error has Happended! Contact Support at ****_***");
		return new HellowWorldBean("Hello World");
	}
	
	@GetMapping(path="/hello-world-bean/{name}")
	public HellowWorldBean helloWorldBean(@PathVariable String name) {
		return new HellowWorldBean(String.format("Hello World %s",name));
	}
}
