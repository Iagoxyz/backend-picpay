package com.picpaysimplificado.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<User> createUser(UserDTO user) {
        
    }
}
