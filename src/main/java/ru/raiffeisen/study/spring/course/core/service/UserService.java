package ru.raiffeisen.study.spring.course.core.service;

import lombok.Data;
import ru.raiffeisen.study.spring.course.core.model.User;

import java.util.Set;

@Data
public class UserService {
    private Set<User> users;
}
