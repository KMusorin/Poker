package ru.mirea.lab2.Ex9;

import java.util.*;

public class Deck {
    // Singleton pattern Double Checked Locking & volatile
    private static volatile Deck instance;
    private final Card[] cards = new Card[52];

    private Deck() {
        int i = 0;
        for (Rank rank : Rank.values()) {
            for (Suits suit : Suits.values()) {
                cards[i] = new Card(rank.getTitle(), suit.getTitle());
                cards[i].setDeck(this); // композиция
                i++;
            }
        }
    }

    public static Deck getInstance() {
        Deck localInstance = instance;
        if (localInstance == null) {
            synchronized (Deck.class){
                localInstance = instance;
                if (localInstance == null){
                    instance = localInstance = new Deck();
                }
            }
        }
        return localInstance;
    }

    public void shuffleCards() {
        int randIndex;
        Card tempCard;
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            randIndex = random.nextInt(cards.length - 1);
            tempCard = cards[i];
            cards[i] = cards[randIndex];
            cards[randIndex] = tempCard;
        }
        System.out.println(Arrays.toString(cards));
    }

    public void deal(Player[] players) {
        int countIndex = 0; //счетчик карт
        for (int i = 0; i < 2 * players.length; i += players.length) { //номер круга раздачи
            for (Player player : players) {
                player.setCard(cards[countIndex]);
                cards[countIndex] = null;
                countIndex++;

            }
        }
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return Arrays.toString(cards);
    }
}
