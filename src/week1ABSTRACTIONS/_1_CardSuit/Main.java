package week1ABSTRACTIONS._1_CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardSuits[] cardSuits = CardSuits.values();

        printingCards(cardSuits);


    }

    private static void printingCards(CardSuits[] cardSuits) {
        System.out.println("Card Suits:");
        for (CardSuits cards: cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", cards.ordinal(), cards);
        }

    }
}
