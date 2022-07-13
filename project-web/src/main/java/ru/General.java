package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.controllers.IndexController;
import ru.service.PrototypeBean;
import ru.service.SingletonBean;

@ComponentScan({"ru", "config"})
@SpringBootApplication
public class General {

    public static void main(String[] args) {
        ApplicationContext contx = SpringApplication.run(General.class, args);

        IndexController indexController = contx.getBean(IndexController.class);
        indexController.sayService();

        System.out.println("BEAN SCOPE");
        SingletonBean singletonBean = contx.getBean(SingletonBean.class);
        System.out.println(singletonBean.getScope());
        SingletonBean singletonBean1 = contx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getScope());

        PrototypeBean prototypeBean = contx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean.getScope());
        PrototypeBean prototypeBean1 = contx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getScope());
    }
}
