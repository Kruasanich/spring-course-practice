package ru.raiffeisen.study.spring.course.core.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.raiffeisen.study.spring.course.core.configuration.DefaultConfiguration;
import ru.raiffeisen.study.spring.course.core.manager.Bank;

public class FirstApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DefaultConfiguration.class);
        Bank raiffeisenBank = context.getBean(Bank.class);
        raiffeisenBank.allUsers().forEach(System.out::println);
    }
}
