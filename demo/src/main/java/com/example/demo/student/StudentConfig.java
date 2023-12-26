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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
           Student leonardo=  new Student("Leonardo","leonardo.cigula@gmail.com", LocalDate.of(2003, Month.JUNE,19));

           Student alex=  new Student("alex","alek.sic@gmail.com", LocalDate.of(2008, Month.JUNE,5));
           repository.saveAll(List.of(leonardo,alex));
        };


    };
}
