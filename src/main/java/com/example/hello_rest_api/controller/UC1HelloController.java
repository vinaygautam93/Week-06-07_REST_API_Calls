package com.example.hello_rest_api.controller;

import org.springframework.web.bind.annotation.*;

// UC1: Simple GET API to return Hello from BridgeLabz
@RestController
@RequestMapping("/hello")
public class UC1HelloController {

    // GET request to return a simple hello message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
