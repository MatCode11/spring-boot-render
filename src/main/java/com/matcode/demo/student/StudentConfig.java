package com.matcode.demo.student;

import java.time.LocalDate;
import java.time.Month;
import static java.time.Month.OCTOBER;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Mariam = new Student(
                    1L,
                    "stanley",
                    "stanley@gmail.com",
                    LocalDate.of(2007, OCTOBER, 2)
            );

            Student Alex = new Student(
                    "mathew",
                    "mat@gmail.com",
                    LocalDate.of(2004, Month.OCTOBER, 2)
            );

            repository.saveAll(
                    List.of(Mariam, Alex)
            );

        };
    }

}
