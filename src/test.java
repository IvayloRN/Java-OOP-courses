import week1ABSTRACTIONS.Season;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");

        Season season = Season.valueOf(tokens[1].toUpperCase());




    }
}
