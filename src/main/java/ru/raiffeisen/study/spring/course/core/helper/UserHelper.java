package ru.raiffeisen.study.spring.course.core.helper;

import ru.raiffeisen.study.spring.course.core.model.User;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class UserHelper {
    private static final Set<User> users = new HashSet<>();
    public static User randomUser() {
        User newUser = new User(UUID.randomUUID(), "Best User in the world");
        users.add(newUser);
        return newUser;
    }

    public static Set<User> allUsers() {
        return users;
    }
}
