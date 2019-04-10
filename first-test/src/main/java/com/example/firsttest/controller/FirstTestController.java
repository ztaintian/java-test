package com.example.firsttest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstTestController {
    @RequestMapping("/first")
    public String Email(@RequestParam("email") String email) {
        System.out.println(email);
        return email;
    }
}
