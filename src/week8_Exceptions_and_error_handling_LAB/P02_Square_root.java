package week8_Exceptions_and_error_handling_LAB;

import java.util.Scanner;

public class P02_Square_root {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            if (number >= 0){
                double sqrtRoot = Math.sqrt(number);
                System.out.printf("%.2f\n", sqrtRoot);
            }else {
                System.out.println("Invalid");
            }
        }catch (NumberFormatException ignored){
            System.out.println("Invalid");
        }finally {
            System.out.println("Goodbye");
        }

    }
}
