package com.luv4code.springframework;

import com.luv4code.springframework.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Luv4codeDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Luv4codeDiApplication.class, args);

        I18NController i18NController = (I18NController) context.getBean("i18NController");
        System.out.println(i18NController.sayHello());


        MyController controller = (MyController) context.getBean("myController");

        System.out.println("---------Primary Bean");
        System.out.println(controller.sayHello());

        System.out.println("---------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---------Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
