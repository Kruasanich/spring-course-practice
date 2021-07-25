package ru.raiffeisen.study.spring.course.core.manager;

import ru.raiffeisen.study.spring.course.core.model.Account;
import ru.raiffeisen.study.spring.course.core.model.Product;
import ru.raiffeisen.study.spring.course.core.model.User;

public interface Bank {
    void transfer(Account from, Account to);
    Double accountAmount(User user);
    void openNewProduct(User user, Product product);
}
