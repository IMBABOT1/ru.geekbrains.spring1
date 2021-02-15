package ru.geekbrains.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedSimpleBean {

    @Autowired
    private GenerateNames generateNames;

    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

    private String data;

    public void printRandomJavaClass(){
        System.out.println(generateNames.createAnimalNames());
    }

}
