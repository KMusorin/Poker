package ru.mirea.lab2.Ex9;

import java.util.Arrays;

public class Player {
    private int playerNumber;
    private final Card[] playerCards = new Card[Deck.getPlayerCardsQuantity()];
    private  int countCards = 0;

    public Player(int number) {
        this.playerNumber = number;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
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
                "number = " + playerNumber +
                ", cards = " + Arrays.toString(playerCards) +
                '}';
    }
}
