package com.koriukaiev.springusers.controller;


import com.koriukaiev.springusers.model.User;
import com.koriukaiev.springusers.service.implementation.InMemoryUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor

public class UserController {

    private final InMemoryUserService service;
//    @Value("${user.ageLimit}")
//    private int ageLimit;
//
//    @PostMapping("/register")
//    public String registerUser(@RequestBody User user) {
//        if (user.getAge() >= ageLimit) {
//            return "User registered successfully!";
//        } else {
//            return "User must be at least " + ageLimit + " years old.";
//        }
//    }

    @GetMapping
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }

    @PostMapping("save_user")
    public String saveUser(@RequestBody User user) {
        service.saveUser(user);
        return "user saved";
    }

    @GetMapping("/{email}")
    public User findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping("update_user")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("delete_user/{email}")
    public void deleteUser(@PathVariable String email) {
        service.deleteUser(email);
    }
}
