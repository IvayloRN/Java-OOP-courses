package week5_Polymorphism_LAB._2_Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(5.0 , 2.0);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculatePerimeter());

    }
}
