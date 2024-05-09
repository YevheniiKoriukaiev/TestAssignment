package com.koriukaiev.springusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringUsersApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(SpringUsersApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
