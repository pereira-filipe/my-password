package com.mypassword.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/password")
public class PasswordController {

    @GetMapping("/{lengthPassword}")
    public String getNewPassword(@PathVariable int lengthPassword) {
        return "Hello World";
    }
}
