package com.example.practice.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
              Student radha = new Student("Radha", "Radha@world.com", 30);
              Student krishna = new Student("Krishna", "Krishna@world.com", 30);
              repository.saveAll(List.of(radha,krishna));
        };
    }
}
