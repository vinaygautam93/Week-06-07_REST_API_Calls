package com.example.hello_rest_api.controller;

import org.springframework.web.bind.annotation.*;

// UC5: PUT API with Path Variable and Query Parameter
@RestController
@RequestMapping("/hello")
public class UC5HelloController {

    // PUT request with path and query parameter
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
