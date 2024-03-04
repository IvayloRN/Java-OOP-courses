package week4_Interfaces_and_Abstractions_LAB._4_Say_Hello_Extended;

public abstract class BasePerson implements Person{
    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
