package week4_Interfaces_and_Abstractions_LAB._01_02_Cars;

public class CarImpl implements Car{
    public String model;
    public String color;
    public Integer horsePower;
    public String countryProduced;

    public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }
    @Override
    public String countryProduced() {
        return countryProduced;
    }
    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have 4 tires",model,countryProduced);
    }

}
