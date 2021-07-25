package ru.raiffeisen.study.spring.course.core.context.find;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.raiffeisen.study.spring.course.core.bean.FirstBean;

public class FindBeanInEmptyContext {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("empty-context.xml");
        context.getBean("notFoundBean"); // If you don't add a bean to the context and try find this bean in the context, you will take an exception.
        context.getBean(FirstBean.class); // If you try to find a bean in the context by Class, but you didn't add this bean to the context, the result will be same.
    }
}
