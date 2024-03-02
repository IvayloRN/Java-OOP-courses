package week2_EncapsulationExcercise.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public List<Product> getProducts(){
        return Collections.unmodifiableList(products);
    }
    private void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }
    public void buyProduct(Product product){
        if (this.money < product.getCost()) {
            throw new IllegalArgumentException(
                    String.format("%s can't afford %s", this.name, product.getName())
            );
        }
        System.out.printf("%s bought %s\n", this.name, product.getName());
        this.products.add(product);
        this.money -= product.getCost();
    }
}

