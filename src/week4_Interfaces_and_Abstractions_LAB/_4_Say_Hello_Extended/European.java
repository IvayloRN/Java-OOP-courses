package week4_Interfaces_and_Abstractions_LAB._4_Say_Hello_Extended;

public class European extends BasePerson {
    public European(String name) {
        super(name);
    }
    @Override
    public String sayHello() {
        return "Hello";
    }
}
