package ru.mirea.lab2.Ex9;

public enum Combinations {
    HIGH_CARD(10),
    PAIR(9),
    TWO_PAIRS(8),
    SET(7),
    STRAIGHT(6),
    FLASH(5),
    FULL_HOUSE(4),
    POKER(3),
    STRAIGHT_FLASH(2),
    FLASH_ROYAL(1);

    private final int ranking;

    Combinations(int ranking) {this.ranking = ranking;}

    public int getRanking() {
        return ranking;
    }
}
