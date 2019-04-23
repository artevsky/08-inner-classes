package objects;

public class Square implements Figure, Printable {
    private double sidesquare;
    private double diagsq;

    public Square (double sidesquare ) {
        this.sidesquare = sidesquare;
    }

    public double getDiagsq() {
        return diagsq=sidesquare*Math.sqrt(2);
    }

    @Override
    public double getArea() {
        return sidesquare*sidesquare;
    }

    @Override
    public double getPerimeter() {
        return sidesquare*4;
    }

    @Override
    public void print() {
        System.out.println("***Square properties:***");
        System.out.println("Area is " + getArea());
        System.out.println("Perimeter is " + getPerimeter());
        System.out.println("Diagonal is " + getDiagsq());

    }
}
