package week8_Exceptions_and_error_handling_LAB;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class P01_Number_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream((scanner.nextLine())
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int start = intArray[0];
        int end = intArray[1];
        System.out.printf("Range: [%d...%d]\n",start , end);
        String input = scanner.nextLine();

        while(!isValid(input, start, end)){

            input = scanner.nextLine();
        }




    }

    private static boolean isValid(String input, int start, int end) {
        Optional<Integer> number = Optional.empty();

        try {
            number = Optional.of(Integer.parseInt(input));

        }catch (NumberFormatException ignored){
        }
        boolean isInRange = number.isPresent() && number.get() >= start && number.get() <= end;

        String output = number.isPresent() && isInRange
                ? String.format("Valid number: %d",number.get())
                :String.format("Invalid number: %s",input);

        System.out.println(output);

        return isInRange;
    }
}
