package ru.raiffeisen.study.spring.course.core.application;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.raiffeisen.study.spring.course.core.manager.Bank;

@Service
@Primary
public class ApplicationLogic {
    private final Bank raiffeisenBank;

    public ApplicationLogic(Bank raiffeisenBank) {
        this.raiffeisenBank = raiffeisenBank;
    }
}
