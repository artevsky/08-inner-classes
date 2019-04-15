package objects;

public class Rectangle implements Figure, Printable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public void print() {
        System.out.println("Rectangle properties:");
        System.out.println("Area is "+getArea());
        System.out.println("Perimeter is "+getPerimeter());

    }
}
