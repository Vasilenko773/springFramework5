package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.controllers.IndexController;

@ComponentScan({"ru", "config"})
@SpringBootApplication
public class General {

    public static void main(String[] args) {
        ApplicationContext contx = SpringApplication.run(General.class, args);

        IndexController indexController = contx.getBean(IndexController.class);
        indexController.sayService();
    }
}
