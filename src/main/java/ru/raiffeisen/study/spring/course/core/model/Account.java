package ru.raiffeisen.study.spring.course.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class Account {
    private Double amount;
    private User owner;
    private AccountLevel accountLevel;
    private Set<Product> products;
}
