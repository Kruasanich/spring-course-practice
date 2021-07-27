package ru.raiffeisen.study.spring.course.core.manager;

import lombok.AllArgsConstructor;
import ru.raiffeisen.study.spring.course.core.model.Account;
import ru.raiffeisen.study.spring.course.core.model.Product;
import ru.raiffeisen.study.spring.course.core.model.User;
import ru.raiffeisen.study.spring.course.core.service.AccountService;
import ru.raiffeisen.study.spring.course.core.service.UserService;

import java.util.Set;

@AllArgsConstructor
public class RaiffeisenBank implements Bank {

    private AccountService accountService;
    private UserService userService;

    @Override
    public void transfer(Account from, Account to) {

    }

    @Override
    public Double accountAmount(User user) {
        return null;
    }

    @Override
    public void openNewProduct(User user, Product product) {

    }

    @Override
    public Set<Account> allAccounts() {
        return null;
    }

    @Override
    public Set<User> allUsers() {
        return userService.getUsers();
    }
}
