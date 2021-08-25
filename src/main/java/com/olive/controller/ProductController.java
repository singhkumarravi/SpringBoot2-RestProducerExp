package com.olive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/msg")
	public ResponseEntity<String> showMsg(){
		
		return new ResponseEntity<String>("Welcome To Producer App", HttpStatus.OK);
	}

}
