package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tasos = new Student(
                    "Tasos",
                    "tasos@gmail.com",
                    LocalDate.of(1992, MAY, 28)
            );
            Student john = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(1994, OCTOBER, 16)
            );

            repository.saveAll(
                    List.of(tasos, john)
            );
        };
    }
}
