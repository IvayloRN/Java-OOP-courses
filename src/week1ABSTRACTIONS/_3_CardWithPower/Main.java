package week1ABSTRACTIONS._3_CardWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        CardsRanks cardsRanksEnum = CardsRanks.valueOf(rank);
        CardSuits cardSuitsEnum = CardSuits.valueOf(suit);

        Card card = new Card(cardsRanksEnum, cardSuitsEnum);
        card.printingCards();



    }
}
