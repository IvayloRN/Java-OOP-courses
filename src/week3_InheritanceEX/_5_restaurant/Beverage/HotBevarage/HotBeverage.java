package week3_InheritanceEX._5_restaurant.Beverage.HotBevarage;

import week3_InheritanceEX._5_restaurant.Beverage.Beverage;

import java.math.BigDecimal;

public class HotBeverage extends Beverage {
    public HotBeverage(String name, BigDecimal price, double milliliters){
        super(name, price, milliliters);
    }
}
