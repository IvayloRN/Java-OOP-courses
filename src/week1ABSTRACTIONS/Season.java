package week1ABSTRACTIONS;

import java.util.Scanner;

public enum Season {
    SPRING(2),
    SUMMER(4),
    AUTUMN(1),
    WINTER(3);


    private final int factor;

    Season(int factor){
        this.factor = factor;
    }

    public int getFactor() {
        return factor;
    }
    public static void printEnums(){
        for (Season ssn: Season.values()) {
            System.out.println(ssn);
        }
    }
}
