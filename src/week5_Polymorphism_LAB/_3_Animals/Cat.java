package week5_Polymorphism_LAB._3_Animals;

public class Cat extends Animal{

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return "I am Oscar and my favourite food is Whiskas\n" +
                "MEEOW";
    }
}
