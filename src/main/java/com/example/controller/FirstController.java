package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

  @GetMapping("/test")
  public ResponseEntity<String> test() {
    return new ResponseEntity("test", HttpStatus.OK);
  }

  @GetMapping("/test2")
  public ResponseEntity<String> test2() {
    return new ResponseEntity("Hello, world!", HttpStatus.OK);
  }
}
