package com.inexture.service2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2/demo")
public class DemoController {

	@GetMapping("/hello")
	public ResponseEntity<String> helloUser() {
		return ResponseEntity.ok("hello user");
	}

}
