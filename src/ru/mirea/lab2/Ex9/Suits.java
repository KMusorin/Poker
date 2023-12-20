package ru.mirea.lab2.Ex9;

public enum Suits {
    DIAMONDS('♦'),
    HEARTS('♥'),
    SPADES('♠'),
    CLUBS('♣');

    private final char title;

    Suits(char title) {
        this.title = title;
    }

    public char getTitle() {
        return title;
    }


    }

