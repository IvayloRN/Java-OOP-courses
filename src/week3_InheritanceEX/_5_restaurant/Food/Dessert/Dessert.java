package week3_InheritanceEX._5_restaurant.Food.Dessert;

import week3_InheritanceEX._5_restaurant.Food.Food;

import java.math.BigDecimal;

public class Dessert extends Food {

    protected double calories;
    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }
    public double getCalories(){
        return calories;
    }
}
