package week8_Exceptions_and_error_handling_LAB;

import java.util.Scanner;

public class MyCustomException extends RuntimeException{
    public MyCustomException(String message){
        super(message);
    }
    public MyCustomException(String message, Exception cause){
        super(message, cause);
    }

}
