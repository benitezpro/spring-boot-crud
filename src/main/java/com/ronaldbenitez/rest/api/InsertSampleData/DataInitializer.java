package com.ronaldbenitez.rest.api.InsertSampleData;

import com.ronaldbenitez.rest.api.Repository.UserRepository;
import com.ronaldbenitez.rest.api.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("Alice", 25, List.of("Java", "spring boot", "HTMX"), true));
            userRepository.save(new User("Bob", 30, List.of("Python", "Flask", "Pandas"), true));
            userRepository.save(new User("Charlie", 28, List.of("JavaScript", "React", "Node.js"), false));
            userRepository.save(new User("Diana", 22, List.of("C++", "OpenGL"), true));
        };
    }
}
