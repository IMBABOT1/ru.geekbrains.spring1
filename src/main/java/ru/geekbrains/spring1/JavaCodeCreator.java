package ru.geekbrains.spring1;

public class JavaCodeCreator implements CodeCreator {
    @Override
    public String javaCodeCreator() {
        return "public class Cat{\n     \n}";
    }
}