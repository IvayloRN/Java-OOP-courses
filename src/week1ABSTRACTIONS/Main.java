package week1ABSTRACTIONS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Season[] seasons = Season.values();
        Season.printEnums();
        for (Season ssn: seasons) {
            System.out.println(ssn.getFactor());
        }
        String input = scanner.nextLine();
        enumUtilityi.printcards(Season.class, input);

    }
}
