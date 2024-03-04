package week3_InheritanceEX._6_animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender){
        super(name, age, gender);
    }
    @Override
    public String produceSound() {
        return "Woof!";
    }
}
