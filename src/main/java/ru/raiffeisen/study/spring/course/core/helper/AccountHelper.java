package ru.raiffeisen.study.spring.course.core.helper;

import ru.raiffeisen.study.spring.course.core.model.Account;

import java.util.Random;
import java.util.Set;

import static ru.raiffeisen.study.spring.course.core.model.AccountLevel.FOREST;

public class AccountHelper {
    public static Set<Account> getAllAccounts() {
        return Set.of(generateAccount(), generateAccount(), generateAccount());
    }

    private static Account generateAccount() {
        return new Account(new Random().nextDouble(), UserHelper.randomUser(), FOREST);
    }
}
