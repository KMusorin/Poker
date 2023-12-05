package ru.mirea.lab6.Ex3;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int n = 10;
        int k = 1;
        getN(n, k);
    }
    public static int getN(int n, int k){
        if (n + 1 == k){
            return 1;
        }
        for (int i = 0; i < k; i++) {
            System.out.print(k + " ");
        }
        return getN(n, k + 1);
    }
}
