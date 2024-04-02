package week8_Exceptions_and_error_handling_LAB;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class sd {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();


        try{
            String as = "asd";
            Integer number = Integer.parseInt(input);

        }catch (NumberFormatException diffFormat){
            throw new NumberFormatException("Different format");
        }finally {

        }


        try{
            calcSqrt(-1);

        }catch (ArithmeticException ex){
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    public static double calcSqrt(double value){
        if (value < 0){
            throw  new MyCustomException("Sqrt for negative numbers is undefined!");
        }
        return Math.sqrt(value);
    }
}
