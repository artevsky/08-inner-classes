package objects;

public class Circle implements Figure, Printable {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        return (Math.PI * this.diameter) / 4;
    }

    @Override
    public double getPerimeter() {
        return (Math.PI * diameter / 2);
    }

    public double getRadius() {
        return (this.diameter / 2);
    }

    @Override
    public void print() {
        System.out.println("Circle properties:");
        System.out.println("Area is "+getArea());
        System.out.println("Perimeter is "+getPerimeter());
        System.out.println("Radius is "+getRadius());

    }
}
