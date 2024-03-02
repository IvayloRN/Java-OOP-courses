package week1ABSTRACTIONS._2_CardRank;

import java.util.Scanner;

public enum CardRank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    public static void printingCardsRanks(CardRank[] cardRank){
        System.out.println("Card Ranks:");
        for (CardRank card: cardRank) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",card.ordinal(), card);
        }
    }
}
