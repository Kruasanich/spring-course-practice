package ru.raiffeisen.study.spring.course.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.raiffeisen.study.spring.course.core.application.ApplicationLogic;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    @Autowired
    private ApplicationLogic applicationLogic;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            Arrays.stream(ctx.getBeanDefinitionNames())
                    .sorted()
                    .forEach(System.out::println);

            applicationLogic.createNewProduct();
        };
    }
}

