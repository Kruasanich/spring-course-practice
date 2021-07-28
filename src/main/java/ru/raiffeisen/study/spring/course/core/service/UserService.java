package ru.raiffeisen.study.spring.course.core.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.raiffeisen.study.spring.course.core.helper.UserHelper;
import ru.raiffeisen.study.spring.course.core.model.User;

import javax.annotation.PostConstruct;
import java.util.Set;

@Data
@Service
public class UserService {
    private Set<User> users;

    @PostConstruct
    public void init() {
        users = UserHelper.allUsers();
    }
}
