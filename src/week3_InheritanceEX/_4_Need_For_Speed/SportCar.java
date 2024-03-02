package week3_InheritanceEX._4_Need_For_Speed;

public class SportCar extends Car{
    public SportCar(double fuel, int horsepower){
        super(fuel,horsepower);
        super.setFuelConsumption(10);
    }
}
