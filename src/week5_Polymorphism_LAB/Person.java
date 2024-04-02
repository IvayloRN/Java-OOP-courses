package week5_Polymorphism_LAB;

import java.util.Scanner;

public class Person extends Mammal implements Animal{
    public static void main(String[] args) {

        Animal animal = new Person();
        Mammal mammal = new Person();
        Object objectt = new Person();

        Person person = new Person();
    }
    @Override
    public String breath() {
        return "breeeeath week5_Polymorphism_LAB._3_Animals.Animal";

    }
}
