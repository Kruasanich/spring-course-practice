package ru.raiffeisen.study.spring.course.core.manager;

import org.springframework.stereotype.Service;
import ru.raiffeisen.study.spring.course.core.model.Account;
import ru.raiffeisen.study.spring.course.core.model.Product;
import ru.raiffeisen.study.spring.course.core.model.User;
import ru.raiffeisen.study.spring.course.core.service.AccountService;
import ru.raiffeisen.study.spring.course.core.service.ProductService;
import ru.raiffeisen.study.spring.course.core.service.UserService;

import java.util.Optional;
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
    public void transfer(Account from, Account to, Double amount) {

    }

    @Override
    public Double accountAmount(User user) {
        return null;
    }

    @Override
    public Account openNewProduct(User user, Product product) {
        Account account =
                accountService
                        .getAccounts()
                        .stream()
                        .filter(acc -> acc.getOwner().equals(user))
                        .findFirst()
                        .orElseThrow();
        account.getProducts().add(product);
        return account;
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
