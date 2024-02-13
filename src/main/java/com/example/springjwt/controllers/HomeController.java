package com.example.springjwt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest/home")
public class HomeController {

    @GetMapping("/getData")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World");
    }


}
