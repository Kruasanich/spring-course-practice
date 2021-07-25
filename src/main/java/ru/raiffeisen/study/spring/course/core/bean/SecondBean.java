package ru.raiffeisen.study.spring.course.core.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SecondBean extends FirstBean {
    private final String greeting = "World was investigated";
}
