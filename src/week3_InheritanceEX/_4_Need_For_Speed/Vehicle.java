package week3_InheritanceEX._4_Need_For_Speed;

import java.util.Scanner;

public class Vehicle {
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    protected double fuelConsumption;
    protected double fuel;
    protected int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public void drive(double kilometers){
        double neededFuel = kilometers * fuelConsumption;
        double fuelLeft = fuel - neededFuel;
        if (fuelLeft >= 0){
            this.setFuel(fuelLeft);
        }
    }
}