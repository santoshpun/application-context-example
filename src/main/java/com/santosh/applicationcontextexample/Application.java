package com.santosh.applicationcontextexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Greeting greeting = context.getBean(Greeting.class);
        System.out.println(greeting.getMessage());

        greeting.setMessage("Good Evening!");
        System.out.println(greeting.getMessage());
    }
}
