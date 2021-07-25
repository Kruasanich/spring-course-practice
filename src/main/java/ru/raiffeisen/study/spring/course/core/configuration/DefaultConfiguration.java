package ru.raiffeisen.study.spring.course.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.raiffeisen.study.spring.course.core.helper.UserHelper;
import ru.raiffeisen.study.spring.course.core.manager.Bank;
import ru.raiffeisen.study.spring.course.core.manager.RaiffeisenBank;
import ru.raiffeisen.study.spring.course.core.service.AccountService;
import ru.raiffeisen.study.spring.course.core.service.UserService;

@Configuration
public class DefaultConfiguration {

    @Bean
    public AccountService accountService() {
        return new AccountService();
    }

    @Bean
    UserService userService() {
        UserService userService = new UserService();
        userService.setUsers(UserHelper.allUsers());
        return userService;
    }

    @Bean
    public Bank raiffeisenBank() {
        return new RaiffeisenBank(accountService(), userService());
    }
}
