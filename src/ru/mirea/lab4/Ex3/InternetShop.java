package ru.mirea.lab4.Ex3;

import java.util.Scanner;

public class InternetShop {

    public static void main(String[] args) {
        User user = new User("dima", "123");

        while (!user.isAuthenticated()) {
            authenticate(user);
        }
        menu();
    }

    public static void  menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите: ");
        System.out.println("1. Каталог товаров");
        System.out.println("2. Корзина");
        System.out.println("3. Профиль");
        int i = scanner.nextInt();

        switch (i){
            case 1:
                for(Catalogs catalog: Catalogs.values()){
                    System.out.println(catalog.getTitle());
                }
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Выбранный каталог отсутствует");
        }
    }
    public static void authenticate(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        user.authenticate(login,pass);
    }
}