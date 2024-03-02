package week1ABSTRACTIONS._3_CardWithPower;

import java.util.Scanner;

public class Card {
    CardsRanks cardsRanks;
    CardSuits cardSuits;

    public Card(CardsRanks cardsRanks, CardSuits cardSuits) {
        this.cardsRanks = cardsRanks;
        this.cardSuits = cardSuits;
    }
    public int getPower(){
        return cardsRanks.getFactor() + cardSuits.getPower();
    }
    public void printingCards(){
        System.out.printf("Card name: %s of %s; Card power: %d",cardsRanks,cardSuits,getPower());
    }
}
