package com.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceHashMap implements MyService {


    @Override
    public String massage() {
        return "Im learning Spring";
    }
}
