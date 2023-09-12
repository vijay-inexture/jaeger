package com.inexture.service1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController 
@RequestMapping("/service1/demo") 
public class DemoController { 
     
   private RestTemplate restTemplate; 
     
   public DemoController(RestTemplate restTemplate) { 
       this.restTemplate = restTemplate; 
    } 
     
   @GetMapping("/hello") 
    public ResponseEntity<String> helloUser() { 
       String response = restTemplate.getForObject("http://localhost:8082/service2/demo/hello", String.class);
       return ResponseEntity.ok(response); 
    } 
 
} 


