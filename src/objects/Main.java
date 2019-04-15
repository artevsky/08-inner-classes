package objects;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.print();
        Circle circle = new Circle(10);
        circle.print();
        Rhombus rhombus = new Rhombus(2, 2);
        rhombus.print();
    }
}
