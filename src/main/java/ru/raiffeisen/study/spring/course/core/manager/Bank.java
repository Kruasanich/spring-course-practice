package ru.raiffeisen.study.spring.course.core.manager;

import ru.raiffeisen.study.spring.course.core.model.Account;
import ru.raiffeisen.study.spring.course.core.model.Product;
import ru.raiffeisen.study.spring.course.core.model.User;

import java.util.Set;

public interface Bank {
    void transfer(Account from, Account to, Double amount);
    Double accountAmount(User user);
    Account openNewProduct(User user, Product product);
    Set<Account> allAccounts();
    Set<User> allUsers();
}
