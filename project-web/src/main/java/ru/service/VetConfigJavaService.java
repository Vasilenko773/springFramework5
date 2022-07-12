package ru.service;

import org.springframework.stereotype.Service;

@Service
public class VetConfigJavaService implements JavaConfigService{

    @Override
    public String say() {
        return "How is your pet feeling?";
    }
}
