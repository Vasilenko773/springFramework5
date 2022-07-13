package ru.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.service.JavaConfigService;

@Controller
public class IndexController {

    private final JavaConfigService javaConfigService;

    public IndexController(@Qualifier(value = "ownerConfigXMlService") JavaConfigService javaConfigService) {
        this.javaConfigService = javaConfigService;
    }

    @RequestMapping({"", "/", "index","index.html"})
    public String index() {
        return "index";
    }

    public void sayService() {
        System.out.println("================================");
        System.out.println("!!!!!! " + javaConfigService.say());
        System.out.println("================================");
    }
}
