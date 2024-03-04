package week4_Interfaces_and_Abstractions_LAB._01_02_Cars;

public class Seat extends CarImpl implements Sellable{
    public Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }


    @Override
    public String toString(){
        return super.toString() + System.lineSeparator() + "Leon sells for " + price;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
