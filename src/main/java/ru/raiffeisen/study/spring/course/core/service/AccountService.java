package ru.raiffeisen.study.spring.course.core.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import ru.raiffeisen.study.spring.course.core.helper.AccountHelper;
import ru.raiffeisen.study.spring.course.core.model.Account;

import javax.annotation.PostConstruct;
import java.util.Set;

@Getter
@Service
public class AccountService {
    private Set<Account> accounts;

    @PostConstruct
    void init() {
        accounts = AccountHelper.getAllAccounts();
    }
}
