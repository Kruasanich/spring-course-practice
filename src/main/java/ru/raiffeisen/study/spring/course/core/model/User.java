package ru.raiffeisen.study.spring.course.core.model;

import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
public class User {

    @NonNull
    private UUID identifier;
    @NonNull
    private String fio;
}
