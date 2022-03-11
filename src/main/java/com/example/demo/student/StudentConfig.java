package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    //    BEAN
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return  args -> {
            Student haya = new Student(
                    "Ernest",
                    "emuroiwa@gmail.com"
            );
            Student haya1 = new Student(
                    "Ernest",
                    "emuroiwa@gmail.com"
            );
            repository.saveAll(List.of(haya, haya1));

        };
    }
}
