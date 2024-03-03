package week3_InheritanceEX._5_restaurant.Food.MainDish;

import week3_InheritanceEX._5_restaurant.Food.Food;

import java.math.BigDecimal;

public class MainDish extends Food {

    public MainDish(String name, BigDecimal price, double grams){
        super(name, price, grams);
    }
}
