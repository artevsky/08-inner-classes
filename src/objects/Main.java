package objects;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.print();
        Circle circle = new Circle(10);
        circle.print();
        Rhombus rhombus = new Rhombus(2, 2);
        rhombus.print();
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.print();
        Square square = new Square(1);
        square.print();

        ShapeUtils.type();

//        ShapeUtils shapeutils = new ShapeUtils();
//        System.out.println(shapeutils);
//        ShapeUtils.figura(3);
//        System.out.println(ShapeUtils.figura(4));
//        shapeutils.print();
    }
}
