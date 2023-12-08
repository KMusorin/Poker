package ru.mirea.lab2.Ex9;

public class Card {
    private final String rank;
    private final char suit;
    private boolean dealt;
    private boolean opened;


    public Card(String rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public boolean isDealt() {
        return dealt;
    }

    public void setDealt() { // Роздана игроку
        this.dealt = true;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened() {  // Открыта на стол
        this.opened = true;
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
