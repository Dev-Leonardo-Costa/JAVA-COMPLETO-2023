package com.educaweb.course.config;

import com.educaweb.course.entities.User;
import com.educaweb.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private UserRepository repository;

    @Autowired
    public TestConfig(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        User leo = new User(null, "Leonardo Costa", "leo@gmail.com","99273-0872","123456");
        User mario = new User(null, "Mario de Sousa", "mario@gmail.com","99978-4516","123456");

        repository.saveAll(Arrays.asList(leo,mario));
    }

}
