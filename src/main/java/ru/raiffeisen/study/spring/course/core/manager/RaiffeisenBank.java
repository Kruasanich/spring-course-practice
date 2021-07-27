package ru.raiffeisen.study.spring.course.core.manager;

import org.springframework.stereotype.Service;
import ru.raiffeisen.study.spring.course.core.model.Account;
import ru.raiffeisen.study.spring.course.core.model.Product;
import ru.raiffeisen.study.spring.course.core.model.User;
import ru.raiffeisen.study.spring.course.core.service.AccountService;
import ru.raiffeisen.study.spring.course.core.service.UserService;

import java.util.Set;

@Service
public class RaiffeisenBank implements Bank {

    private final AccountService accountService;
    private final UserService userService;

    public RaiffeisenBank(AccountService accountService, UserService userService) {
        this.accountService = accountService;
        this.userService = userService;
    }

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
