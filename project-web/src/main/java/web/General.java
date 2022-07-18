package web;

import data.config.FakeDataSource;
import data.config.ClassConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication(scanBasePackages = {"data", "web"})
public class General {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(General.class, args);

        System.out.println("FakeDataSource.class");
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getPassword());

        System.out.println("ClassConfiguration.class");
        ClassConfiguration classConfiguration = context.getBean(ClassConfiguration.class);
        System.out.println(classConfiguration.getUrl());
    }
}
