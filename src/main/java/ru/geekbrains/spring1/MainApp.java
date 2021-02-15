package ru.geekbrains.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

//    public static void main(String[] args) {
//       // temp();
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
//        AnnotatedSimpleBean annotatedSimpleBean = context.getBean("annotatedSimpleBean", AnnotatedSimpleBean.class);
//        annotatedSimpleBean.setData("a");
//        System.out.println(annotatedSimpleBean.getData());
//
//        annotatedSimpleBean.printRandomJavaClass();
//
//
//    }
//
//    private static void temp() {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
//
//        CodeCreator codeCreator = context.getBean("javaCodeCreator", CodeCreator.class);
//        GenerateNames generateNames = context.getBean("createAnimalNames", AnimalNames.class);
//        SimpleBean simpleBean = context.getBean("setField", SimpleBean.class);
//        simpleBean.setField("s");
//        System.out.println(simpleBean.getField());
//        SimpleBean simpleBean1 = context.getBean("setField", SimpleBean.class);
//        simpleBean1.setField("a");
//        System.out.println(simpleBean1.getField());
//    }

    public static void main(String[] args) {
        ApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
        CodeCreator javacc = context.getBean("javaCodeCreator", CodeCreator.class);
        System.out.println(javacc.javaCodeCreator());
        ((AnnotationConfigApplicationContext) context).close();

    }
}