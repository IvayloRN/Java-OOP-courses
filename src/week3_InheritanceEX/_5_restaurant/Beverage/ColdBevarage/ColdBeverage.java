package week3_InheritanceEX._5_restaurant.Beverage.ColdBevarage;

import week3_InheritanceEX._5_restaurant.Beverage.Beverage;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage {
    public ColdBeverage(String name, BigDecimal price, double milliliters){
        super(name, price, milliliters);
    }
}
