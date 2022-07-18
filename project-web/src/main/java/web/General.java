package web;

import data.config.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication(scanBasePackages = {"data", "web"})
public class General {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(General.class, args);

        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getPassword());
    }
}
