package ru.geekbrains.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        CodeCreator codeCreator = context.getBean("ru.geekbrains.spring1.JavaCodeCreator", CodeCreator.class);

        GenerateNames generateNames = context.getBean("ru.geekbrains.spring1.GenerateNames", GenerateNames.class);

        System.out.println(codeCreator.javaCodeCreator());

        System.out.println(generateNames.generateNames());
    }
}
