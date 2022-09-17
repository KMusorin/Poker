package ru.mirea.lab2.Ex4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PC pc = new PC("", "", "", "");
        Shop shop = new Shop();

        while (true) {
            System.out.println("Введите команду (add, delete, search, array или exit - что бы выйти): ");
            String s = scanner.nextLine();
            if (s.equals("add")) {
                shop.addPC(shop.input());
                System.out.println("Компьютер успешно добавлен!");
            } else if (s.equals("delete")) {
                shop.deletePC(shop.input());
            } else if (s.equals("search")) {
                System.out.println(shop.searchPC(shop.input()));
            } else if (s.equals("array")) {
                for (PC ps : shop.arrayPCs) {
                    System.out.println(ps);
                }
            } else if (s.equals("exit")) {
                break;
            }
        }
    }
}
