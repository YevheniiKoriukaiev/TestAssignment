package com.koriukaiev.springusers.repository;

import com.koriukaiev.springusers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IUserRepository extends JpaRepository<User, Long> {
    void deleteUserByEmail(String email);

    User findUserByEmail(String email);
}

