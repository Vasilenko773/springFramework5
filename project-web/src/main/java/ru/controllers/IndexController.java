package ru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.service.OwnerConfigJavaService;

@Controller
public class IndexController {

    private final OwnerConfigJavaService ownerConfigJavaService;

    public IndexController(OwnerConfigJavaService ownerConfigJavaService) {
        this.ownerConfigJavaService = ownerConfigJavaService;
    }

    @RequestMapping({"", "/", "index","index.html"})
    public String index() {

        return "index";
    }
}
