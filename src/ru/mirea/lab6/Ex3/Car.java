package ru.mirea.lab6.Ex3;

public class Car implements Nameable {
    private String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
