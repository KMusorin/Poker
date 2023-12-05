package ru.mirea.lab4.Ex4;

public class Processor {
    private String name;
    private String frequency;

    public Processor(String name, String frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "{" +
                "name: '" + name + '\'' +
                ", frequency: '" + frequency + '\'' +
                '}';
    }
}
