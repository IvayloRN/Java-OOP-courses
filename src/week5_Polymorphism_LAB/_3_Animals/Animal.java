package week5_Polymorphism_LAB._3_Animals;

public abstract class Animal {
    protected String name;
    protected String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public abstract String explainSelf();
}
