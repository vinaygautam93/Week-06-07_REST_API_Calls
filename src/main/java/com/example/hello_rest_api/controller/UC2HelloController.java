package com.example.hello_rest_api.controller;

import org.springframework.web.bind.annotation.*;

// UC2: GET API with Query Parameter
@RestController
@RequestMapping("/hello")
public class UC2HelloController {

    // GET request with query parameter
    @GetMapping("/query")
    public String sayHelloWithQueryParam(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
