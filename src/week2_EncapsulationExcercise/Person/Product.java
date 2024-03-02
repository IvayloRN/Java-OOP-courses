package week2_EncapsulationExcercise.Person;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Product {
    //-	name: String
    //-	cost: double
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    private void setName(String name) {
        if (null == name || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    private void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }

}
