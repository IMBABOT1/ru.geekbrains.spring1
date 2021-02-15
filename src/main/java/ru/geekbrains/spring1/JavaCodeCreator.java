package ru.geekbrains.spring1;

public class JavaCodeCreator implements  CodeCreator{
    public GenerateNames getGenerateNames() {
        return generateNames;
    }

    public void setGenerateNames(GenerateNames generateNames) {
        this.generateNames = generateNames;
    }

    private  GenerateNames generateNames;

    @Override
    public String javaCodeCreator() {
        return "public class " +generateNames.createAnimalNames() + "{\n     \n}";
    }
}
