package ru.mirea.lab6.Ex3;

import java.util.Arrays;

public class TestInterface {
    public static void main(String[] args) {
        Object[] list = new Object[]{new Planet("Earth"), new Car("Lada"), new Animal("Lion")};
        System.out.println(Arrays.toString(list));
    }
}