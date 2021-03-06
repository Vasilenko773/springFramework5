package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"data", "web"})
public class General {

    public static void main(String[] args) {
      SpringApplication.run(General.class, args);
    }
}
