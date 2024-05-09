package com.koriukaiev.springusers.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    @NonNull
    private String email;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private LocalDate dateOfBirth;
    @Transient
    private int age;
    private String address;
    private int phoneNumber;

    public int getAge() {
        return Period.between(dateOfBirth,LocalDate.now()).getYears();
    }

    public User() {

    }
}
