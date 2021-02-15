package ru.geekbrains.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {


 //<bean id="createAnimalNames" class="ru.geekbrains.spring1.AnimalNames">
//</bean>
    @Bean("createAnimalNames")
   public AnimalNames createName(){
        GenerateNames generateNames = new AnimalNames();
        return (AnimalNames) generateNames;
   }

    @Bean("javaCodeCreator")
    public CodeCreator codeCreator(){
        CodeCreator codeCreator = new JavaCodeCreator();
        ((JavaCodeCreator) codeCreator).setGenerateNames(createName());
        return codeCreator;
    }
}