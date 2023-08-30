package com.springbootcustombanner.springbootcustombanner.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner")
public class BannerController {
    @GetMapping("/custombanner")
    public ResponseEntity<String> sayGreetHello(){
        return new ResponseEntity<>("HI Welcome to Spring Boot Custom Banner", HttpStatus.OK);
    }
}
