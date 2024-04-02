package week5_Polymorphism_LAB._3_Animals;

public class Dog extends Animal{

    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return "I am Rocky and my favourite food is Meat\n" +
                "DJAAF";
    }
}
