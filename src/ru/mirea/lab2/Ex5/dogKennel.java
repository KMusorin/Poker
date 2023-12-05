package ru.mirea.lab2.Ex5;

public class dogKennel {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog("Jack", 10), new Dog("Joe", 3)};

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}
