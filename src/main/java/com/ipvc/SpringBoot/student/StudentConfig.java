package com.ipvc.SpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student rafael = new Student(
                    "Rafael",
                    "rmonteiro811@gmail.com",
                    LocalDate.of(2002, Month.SEPTEMBER, 28)
            );

            Student john = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2002, Month.MAY, 14)
            );

            studentRepository.saveAll(List.of(rafael, john));
        };
    }

}
