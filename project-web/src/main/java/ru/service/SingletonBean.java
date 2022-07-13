package ru.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Создание Сингелтона");
    }

    public String getScope() {
        return "This is singleton bean";
    }
}
