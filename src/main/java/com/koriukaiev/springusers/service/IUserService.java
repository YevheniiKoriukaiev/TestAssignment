package com.koriukaiev.springusers.service;

import com.koriukaiev.springusers.model.User;

import java.util.List;


public interface IUserService {
    List<User> findAllUsers();
    User saveUser(User user);
    User findByEmail (String email);
//    User findByAge (int age);
    User updateUser (User user);
    void deleteUser (String email);
}
