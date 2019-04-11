package com.example.firsttest.controller;

import com.example.firsttest.modules.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    @RequestMapping("/testJson")
    public User testJson() {
        User user = new User();
        user.setName("li jia");
        user.setAge(27);
        user.setAddress("北京");
        return user;
    }
}
