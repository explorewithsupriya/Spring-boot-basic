package com.supriya.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController(value = "/test")
public class TestController {
	
	@PostMapping("/update")
	public String updateData(@RequestBody String data){
		System.out.println("data is "+data);
		return "yes";
	}
	
	@GetMapping("/hello")
	public String helloData(){
		
		return "Hello from Spring Rest controller";
	}

}
