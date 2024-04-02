package week5_Polymorphism_LAB._2_Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public Double calculateArea() {
        return height * width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
