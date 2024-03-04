package week4_Interfaces_and_Abstractions_LAB._01_02_Cars;

public class Audi extends CarImpl implements Rentable{
    public Integer minRentDay;
    public Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return null;
    }

    @Override
    public Double getPricePerDay() {
        return null;
    }
    @Override
    public String toString(){
        return super.toString() + System.lineSeparator() + "Minimum rental period of " + minRentDay + " days. Price per day " + pricePerDay;
    }
}
