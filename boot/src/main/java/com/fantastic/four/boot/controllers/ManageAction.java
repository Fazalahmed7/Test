package com.fantastic.four.boot.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ManageAction {
	
		@GetMapping("/firstApiCall")
		public ResponseEntity<String> getFirstApiCall(){
			String resp = "Hello world from Server REST API"; 
			return new ResponseEntity<String>(resp,HttpStatus.OK);
		}
}
