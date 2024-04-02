package week8_Exceptions_and_error_handling_LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class P03_Enter_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();
        int range = 100;
        int start = 1;

        while (listOfNumbers.size() != 10){
            String input = scanner.nextLine();
            try {
               // if (isStringInteger(input)) {
                    int number = Integer.parseInt(input);
                    if (number > start && number < range) {
                        listOfNumbers.add(number);
                        start = number;

                    } else {
                        System.out.printf("Your number is not in range %d - 100!\n", start);
                    }
              //  }
            }catch (NumberFormatException ex){
                System.out.println("Invalid Number!");
            }

        }
        System.out.println(String.join(", ",listOfNumbers.stream().map(e->String.valueOf(e)).toArray(String[]::new)));
    }

/*    private static boolean isStringInteger(String input) {
        for (char c:input.toCharArray()) {
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }*/
}
