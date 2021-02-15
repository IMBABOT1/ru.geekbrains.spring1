package ru.geekbrains.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        CodeCreator codeCreator = context.getBean("ru.geekbrains.spring1.JavaCodeCreator", CodeCreator.class);

        System.out.println(codeCreator.javaCodeCreator());
    }
}
