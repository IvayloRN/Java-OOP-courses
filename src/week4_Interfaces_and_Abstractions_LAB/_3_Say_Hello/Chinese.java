package week4_Interfaces_and_Abstractions_LAB._3_Say_Hello;

public class Chinese implements Person{
    private String name;
    public Chinese(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
