package week1ABSTRACTIONS._2_CardRank;

import java.util.Scanner;

import static week1ABSTRACTIONS._2_CardRank.CardRank.printingCardsRanks;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRank[] cardRank = CardRank.values();
        printingCardsRanks(cardRank);
    }
}
