package com.example.hello_rest_api.controller;

import org.springframework.web.bind.annotation.*;

// UC3: GET API with Path Variable
@RestController
@RequestMapping("/hello")
public class UC3HelloController {

    // GET request with path variable
    @GetMapping("/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
