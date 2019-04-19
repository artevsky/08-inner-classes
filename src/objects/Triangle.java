package objects;

public class Triangle implements Figure, Printable {
    private double a;
    private double b;
    private double c;
    private double hp;
    private double Ha;


    public Triangle (double a, double b, double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getHp() {
        return (a+b+c)/2 ;
    }

    public double getHa() {
        return 2*getArea()/a;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(getHp()*(getHp()-a)*(getHp()-b)*(getHp()-c)));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public void print() {
        System.out.println("Triangle properties:");
        System.out.println("Area is " + getArea());
        System.out.println("Perimeter is " + getPerimeter());
        System.out.println("Height is " + getHa());
        if ((Math.pow(a, 2)+(Math.pow(b, 2))) == (Math.pow(c, 2))) {
            System.out.println("This is right triangle");
        }
    }
}
