package com.example.hello_rest_api.controller;


//import com.example.hello_rest_api.restapi.dto.UserDTO;
import com.example.hello_rest_api.dto.UserDTO;

import org.springframework.web.bind.annotation.*;

// UC4: POST API with JSON Body
@RestController
@RequestMapping("/hello")
public class UC4HelloController {

    // POST request to accept user data from JSON
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
