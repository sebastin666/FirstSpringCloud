package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudTestRunner {
	
	@GetMapping("/")
	public String initCall() {
		return "CLOUD CALL WORKING....";
	}
	
	@GetMapping("showcaller/{name}")
	public String showCaller(@PathVariable("name") String sName) {
		return "The caller name is "+sName;
	}

}
