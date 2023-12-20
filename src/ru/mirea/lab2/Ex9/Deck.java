package ru.mirea.lab2.Ex9;

import java.util.*;

public class Deck {
    private static final int deckCardsQuantity = 52;
    private static final int playerCardsQuantity = 2;
    private static final int openCardsQuantity = 5;
    // Singleton pattern Double Checked Locking & volatile
    private static volatile Deck instance;
    private static final Card[] cards = generateNewDeck();
    static{
        shuffleCards();
    }
    private static final Card[] openedCards = new Card[openCardsQuantity];




    private Deck() {}

    private static Card[] generateNewDeck(){
        int i = 0;
        Card[] tempCards = new Card[deckCardsQuantity];
        for (Ranks rank : Ranks.values()) {
            for (Suits suit : Suits.values()) {
                tempCards[i] = new Card(rank, suit);
                i++;
            }
        }
        return tempCards;
    }

    // Singleton pattern Double Checked Locking
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
        for (int i = 0; i < playerCardsQuantity * players.length; i += players.length) { //номер круга раздачи
            for (Player player : players) {
                player.setCard(cards[countIndex]);
                cards[countIndex].setDealt();
                countIndex++;

            }
        }
        openCardsToTable();
    }

    private static void openCardsToTable(){
        Card[] tempOpenedCards;
        tempOpenedCards = Arrays.stream(Arrays.copyOfRange(Arrays.stream(cards)
                .filter(card -> card.isDealt() == false).toArray(),0,openCardsQuantity)).toArray(Card[]::new);
        int countCard = openCardsQuantity;
        for(Card card: tempOpenedCards){
            card.setOpened();
            openedCards[openCardsQuantity - countCard] = card;
            countCard--;
        }


    }




    public Card[] getOpenCards() {

/*        switch (stage) {
            case FLOP -> {
                int countIndex = 3;






            }
        }*/


        return openedCards;
    }
    public static int getPlayerCardsQuantity(){
        return playerCardsQuantity;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(cards).filter(card -> card.isDealt() == false && card.isOpened() == false).toArray());
    }
}
