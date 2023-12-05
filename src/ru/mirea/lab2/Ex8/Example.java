package ru.mirea.lab2.Ex8;

import java.util.Arrays;

public class Example {
    private static final String[] strings = new String[]{"a", "b", "c", "d", "e", "f"};

    public static void main(String[] args) {
        String temp;
        for (int i = 0; i < strings.length / 2; i++) {
            temp = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = strings[i];
            strings[i] = temp;
        }
        System.out.println(Arrays.toString(strings));
    }
}
