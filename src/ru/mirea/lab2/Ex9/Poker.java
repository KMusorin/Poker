package ru.mirea.lab2.Ex9;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Poker {
    private static Player[] players = inputPlayerQty();
    private static Deck deck = Deck.getInstance();


    public static void main(String[] args) {
        deck.deal(players);
        System.out.println(deck);
//        System.out.println(deck1);
        System.out.println(Arrays.toString(players));
        System.out.println(Arrays.toString(deck.getOpenCards()));

    }

    private static Player[] inputPlayerQty() {
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
