package week4_Interfaces_and_Abstractions_LAB._6_Ferrari;

public class Ferrari implements Car{
    private static final String MODEL = "488-Spider";
    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }
    public String toString(){
        return String.format("%s/%s/%s/%s",MODEL,brakes() ,gas(),driverName);
    }
}