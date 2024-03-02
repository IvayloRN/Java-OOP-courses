package week2_EncapsulationExcercise.ClassBox;

public class Box {
    private Double length;
    private double width;
    private double height;

    public double getLength() {
        if (this.length == null) {
            return 0;
        }
        return this.length;
    }
    public Box(double length, double width, double height) {
//  +   week2_EncapsulationExcercise.ClassBox.Box (double length, double width, double height)
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }
    private void setLength(double length) {
        if (validationCheck(length)) {
            throw new IllegalArgumentException("Lenght cannot be zero or negative.");
        }
        this.length = length;
    }
    private void setHeight(double height) {
        if (validationCheck(height)) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }
    private void setWidth(double width) {
        if (validationCheck(width)){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }
    public double calculateSurfaceArea(){
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }
    public double calculateLateralSurfaceArea(){
        return 2 * length * height + 2 * width * height;
    }
    public double calculateVolume(){
        return length * height * width;
    }
    private boolean validationCheck(double side){
        return side <= 0;
    }
}





