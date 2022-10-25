package ru.mirea.lab2.Ex9;

public class Card {
    private final String rank;
    private final char suit;
    private Player player;
    private Deck deck;

    public Card(String rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public String getRank() {
        return rank;
    }

    public char getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + suit;
    }
}
