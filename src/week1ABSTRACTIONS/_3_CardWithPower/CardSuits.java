package week1ABSTRACTIONS._3_CardWithPower;

import java.util.Scanner;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private final int power;

    CardSuits(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
