package com.koriukaiev.springusers.service.implementation;

import com.koriukaiev.springusers.model.User;
import com.koriukaiev.springusers.repository.IUserRepository;
import com.koriukaiev.springusers.service.IUserService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Primary
public class UserService implements IUserService {
    private final IUserRepository repository;

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return repository.findUserByEmail(email);
    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(String email) {
        repository.deleteUserByEmail(email);
    }


}
