package ru.mirea.lab2.Ex9;

import java.util.*;

public class Deck {
    // Singleton pattern Double Checked Locking & volatile
    private static volatile Deck instance;
    private static final Card[] cards = generateNewDeck();
    private static final Card[] openedCards = openCardsToTable();
    static{
        shuffleCards();
    }

    private Deck() {}

    private static Card[] generateNewDeck(){
        int i = 0;
        Card[] tempCards = new Card[52];
        for (Rank rank : Rank.values()) {
            for (Suits suit : Suits.values()) {
                tempCards[i] = new Card(rank.getTitle(), suit.getTitle());
                i++;
            }
        }
        return tempCards;
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

    private static void shuffleCards() {
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

    public static void deal(Player[] players) {
        int countIndex = 0; //счетчик карт
        for (int i = 0; i < 2 * players.length; i += players.length) { //номер круга раздачи
            for (Player player : players) {
                player.setCard(cards[countIndex]);
                cards[countIndex].setDealed();
                countIndex++;

            }
        }
        openCardsToTable();
    }

    private static Card[] openCardsToTable(){
        Card[] tempOpenedCards = new Card[5];
        tempOpenedCards = Arrays.stream(Arrays.copyOfRange(Arrays.stream(cards)
                .filter(card -> card.isDealt() == false).toArray(),0,5)).toArray(Card[]::new);
        //openedCards = tempOpenedCards;
        for(Card card: tempOpenedCards){
            card.setOpened();
        }
        return tempOpenedCards;
    }




    public Card[] getOpenCards() {

/*        switch (stage) {
            case FLOP -> {
                int countIndex = 3;






            }
        }*/


        return openedCards;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(cards).filter(card -> card.isDealt() == false && card.isOpened() == false).toArray());
    }
}
