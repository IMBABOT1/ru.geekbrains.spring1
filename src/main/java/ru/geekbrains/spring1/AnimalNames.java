package ru.geekbrains.spring1;

public class AnimalNames implements GenerateNames{
    @Override
    public String createAnimalNames() {
        String[] arr = {"cat", "dog", "animal"};
        return arr[(int) (Math.random() * arr.length)];
    }
}
