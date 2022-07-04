package com.controller;

import com.service.MyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    private final MyService service;

    public SomeController(@Qualifier("myServiceHashMap") MyService service) {
        this.service = service;
    }

    @GetMapping("mesage")
    public String message() {
        return service.massage();
    }
}
