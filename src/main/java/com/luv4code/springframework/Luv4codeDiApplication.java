package com.luv4code.springframework;

import com.luv4code.springframework.controllers.MyController;
import com.luv4code.springframework.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Luv4codeDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Luv4codeDiApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");

        FakeDataSource fakeDataSource = context.getBean("fakeDataSource", FakeDataSource.class);
        System.out.println(fakeDataSource.getUser() + " " + fakeDataSource.getUrl());
    }

}
