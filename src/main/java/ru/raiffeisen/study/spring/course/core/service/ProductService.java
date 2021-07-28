package ru.raiffeisen.study.spring.course.core.service;

import org.springframework.stereotype.Service;
import ru.raiffeisen.study.spring.course.core.model.Product;
import ru.raiffeisen.study.spring.course.core.model.ProductType;

@Service
public class ProductService {
    public Product create(String name, ProductType type) {
        return new Product(name, type);
    }
}
