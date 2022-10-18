package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student1 = new Student(
                    "Joe",
                    "joe@gmail.com",
                    LocalDate.of(1992, Month.FEBRUARY, 2)
            );

            Student student2 = new Student(
                    "Doe",
                    "doe@gmail.com",
                    LocalDate.of(2011, Month.FEBRUARY, 3)
            );

            repository.saveAll(
                    List.of(student1, student2)
            );
        };
    }
}
