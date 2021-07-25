package ru.raiffeisen.study.spring.course.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private String name;
    private ProductType type;
}
