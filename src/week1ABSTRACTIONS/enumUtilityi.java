package week1ABSTRACTIONS;

import java.util.Scanner;

public class enumUtilityi {

    private enumUtilityi(){
    }

    public static <T extends Enum<T>> void printcards(Class<T> eNum, String type){
        System.out.printf("Card %s:\n", type);
        for (T cardEnum: eNum.getEnumConstants()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",cardEnum.ordinal(),cardEnum);
        }
    }
}
