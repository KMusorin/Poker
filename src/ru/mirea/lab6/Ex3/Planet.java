package ru.mirea.lab6.Ex3;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                '}';
    }
}
