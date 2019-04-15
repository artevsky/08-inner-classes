package objects;

public class Rhombus implements Figure, Printable {
    private double diag1;
    private double diag2;
    private double side;

    public Rhombus(double diag1, double diag2) {
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    public double getSide() {
        return side = (Math.sqrt((Math.pow(diag1, 2) + Math.pow(diag2, 2)) / 4));
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public void print() {
        System.out.println("Rhombus properties:");
        System.out.println("Area is " + getArea());
        System.out.println("Perimeter is " + getPerimeter());
        System.out.println("Side is " + getSide());
    }
}
