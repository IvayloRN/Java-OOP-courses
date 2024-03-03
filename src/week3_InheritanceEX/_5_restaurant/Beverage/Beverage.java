package week3_InheritanceEX._5_restaurant.Beverage;

import week3_InheritanceEX._5_restaurant.Product;

import java.math.BigDecimal;

public class Beverage extends Product {
    protected double milliliters;
    public Beverage(String name, BigDecimal price, double milliliters){
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
