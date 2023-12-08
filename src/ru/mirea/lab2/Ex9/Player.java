package ru.mirea.lab2.Ex9;

import java.util.Arrays;

public class Player {
    private int number;
    private final Card[] playerCards = new Card[2];
    private int countCards = 0;

    public Player(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCard(Card card) {
        if (playerCards.length - countCards > 0) {
            playerCards[playerCards.length - 1 - countCards] = card;
            countCards++;

        } else {
            System.out.println("Невозможно добавить карту, нет свободного слота");
        }
    }

    public Card[] getPlayerCards() {
        return playerCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number = " + number +
                ", cards = " + Arrays.toString(playerCards) +
                '}';
    }
}
