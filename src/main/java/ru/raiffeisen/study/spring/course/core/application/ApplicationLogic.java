package ru.raiffeisen.study.spring.course.core.application;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.raiffeisen.study.spring.course.core.manager.Bank;
import ru.raiffeisen.study.spring.course.core.model.ProductType;
import ru.raiffeisen.study.spring.course.core.service.ProductService;

@Service
@Primary
public class ApplicationLogic {
    private final Bank raiffeisenBank;
    private final ProductService productService;

    public ApplicationLogic(Bank raiffeisenBank, ProductService productService) {
        this.raiffeisenBank = raiffeisenBank;
        this.productService = productService;
    }

    public void createNewProduct() {
        raiffeisenBank
                .allUsers()
                .stream()
                .findFirst()
                .map(user -> raiffeisenBank.openNewProduct(user, productService.create("Credit card", ProductType.CREDIT_CARD)))
                .ifPresent(System.out::println);
    }
}
