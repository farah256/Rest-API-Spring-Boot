package com.example.tutoSpringAmigo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args ->{
            Student ahmed = new Student(
                    "Ahmed",
                    LocalDate.of(2006,5,12),
                    "ahmed@gmail.com");
            Student sarah = new Student(
                    "Sarah",
                    LocalDate.of(1999,1,26),
                    "sarah@gmail.com");
            studentRepository.saveAll(
                    List.of(ahmed,sarah)
            );

        };
    }
}
