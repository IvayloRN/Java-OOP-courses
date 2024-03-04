package week4_Interfaces_and_Abstractions_LAB._01_02_Cars;

import java.io.Serializable;
import java.util.Scanner;

public interface Car extends Serializable {
    Integer TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}
//+getModel(): String
//+getColor(): String
//+getHorsePower(): Integer
//+countryProduced(): String