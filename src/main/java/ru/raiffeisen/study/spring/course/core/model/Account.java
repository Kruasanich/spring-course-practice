package ru.raiffeisen.study.spring.course.core.model;

import lombok.Data;
import lombok.NonNull;

import java.util.Set;

@Data
public class Account {
    @NonNull
    private Double amount;
    @NonNull
    private User owner;
    @NonNull
    private AccountLevel accountLevel;
    private Set<Product> products;
}
