package week3_InheritanceEX._4_Need_For_Speed;

public class Car extends Vehicle{
    public Car(double fuel, int horsepower){
        super(fuel,horsepower);
        super.setFuelConsumption(3);
    }
}
