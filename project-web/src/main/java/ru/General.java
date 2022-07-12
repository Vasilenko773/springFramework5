package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"ru", "config"})
@SpringBootApplication
public class General {

    public static void main(String[] args) {
        SpringApplication.run(General.class, args);
    }
}
