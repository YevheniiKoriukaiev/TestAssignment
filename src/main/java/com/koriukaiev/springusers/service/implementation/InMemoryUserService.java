package com.koriukaiev.springusers.service.implementation;

import com.koriukaiev.springusers.model.User;
import com.koriukaiev.springusers.repository.InMemoryUserDAO;
import com.koriukaiev.springusers.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class InMemoryUserService implements IUserService {
    private final InMemoryUserDAO repository;

    @Override
    public List<User> findAllUsers() {
        return repository.findAllUsers();
    }

    @Override
    public User saveUser(User user) {
        return repository.saveUser(user);
    }

    @Override
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

//    @Override
//    public User findByAge(int age) {
//        return repository.fi;
//    }

    @Override
    public User updateUser(User user) {
        return repository.updateUser(user);
    }

    @Override
    public void deleteUser(String email) {
        repository.deleteUser(email);
    }
}
