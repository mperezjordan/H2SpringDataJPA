package com.mpjmario.h2springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2SpringDataJpaApplication {

    public static void main(String[] args) {

        SpringApplication.run(H2SpringDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args) -> {
            insertEmployees(repository);
            System.out.println(repository.findAll());
        };
    }

    public void insertEmployees ( EmployeeRepository repository) {
        repository.save(new Employee("Mario", "Jordan"));
        repository.save(new Employee("Jennifer","Alban"));
        repository.save(new Employee("Rhonda", "Lee"));
    }
}
