package ru.mirea.lab2.Ex9;

public class Card {
    private final Ranks rank;
    private final Suits suit;
    private boolean dealt;
    private boolean opened;


    public Card(Ranks rank, Suits suit) {
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

    public Ranks getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank.getTitle() + suit.getTitle();
    }
}
