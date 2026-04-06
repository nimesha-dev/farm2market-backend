package com.farm2market.backend.controller;

import com.farm2market.backend.model.User;
import com.farm2market.backend.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/test")
    public String test() {
        return "User API is working!";
    }
}
