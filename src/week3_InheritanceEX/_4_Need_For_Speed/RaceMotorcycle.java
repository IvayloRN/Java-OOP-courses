package week3_InheritanceEX._4_Need_For_Speed;

public class RaceMotorcycle extends Motorcycle{
    public RaceMotorcycle(double fuel, int horsepower){
        super(fuel,horsepower);
        super.setFuelConsumption(8);
    }
}
