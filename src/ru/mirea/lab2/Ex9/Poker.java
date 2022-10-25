package ru.mirea.lab2.Ex9;

import java.util.Arrays;
import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {
        Deck deck = new Deck();
//        System.out.println(deck); //не размешаная колода
        deck.shuffleCards();
        Player[] players = inputPlayerQty();
        deck.deal(players);
        System.out.println(deck);
        System.out.println(Arrays.toString(players));
    }

    public static Player[] inputPlayerQty() {
        Scanner scanner = new Scanner(System.in);
        int playerNumber = 0;
        while (playerNumber < 2 || playerNumber > 9) {
            System.out.println("Введите количество игроков от 2 до 9: ");
            playerNumber = scanner.nextInt();
            if (playerNumber < 2 || playerNumber > 9) {
                System.out.println("Введено неверное количество игроков.");
            }
        }
        Player[] players = new Player[playerNumber];
        for (int i = 0; i < playerNumber; i++) {
            players[i] = new Player(i + 1);
        }
        return players;
    }
}
