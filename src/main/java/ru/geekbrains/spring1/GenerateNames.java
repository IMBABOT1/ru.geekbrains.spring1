package ru.geekbrains.spring1;

public class GenerateNames implements  GenerateAnimalNames{
    @Override
    public String generateNames() {
        String[] arr = {"dog", "cat", "cow", "horse"};
        return arr[(int) (Math.random() * arr.length)];
    }
}
