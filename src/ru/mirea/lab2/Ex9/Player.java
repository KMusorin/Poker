package ru.mirea.lab2.Ex9;

import java.util.Arrays;

public class Player {
    private int number;
    private final Card[] cards = new Card[2];
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
        if (cards.length - countCards > 0) {
            cards[cards.length - 1 - countCards] = card;
            card.setDealed(); //композиция
            countCards++;

        } else {
            System.out.println("Невозможно добавить карту, нет свободного слота");
        }
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number = " + number +
                ", cards = " + Arrays.toString(cards) +
                '}';
    }
}
