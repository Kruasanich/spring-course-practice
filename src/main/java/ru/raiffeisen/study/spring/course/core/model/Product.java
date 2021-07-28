package ru.raiffeisen.study.spring.course.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private ProductType type;
}
