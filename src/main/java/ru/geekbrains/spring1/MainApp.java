package ru.geekbrains.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");

        CodeCreator codeCreator = context.getBean("javaCodeCreator", CodeCreator.class);

        System.out.println(codeCreator.javaCodeCreator());

    }
}