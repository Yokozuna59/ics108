public class Triangle extends GeometricObject {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree, String color, boolean filled) {
        super(color, filled);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(
                semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree));
    }

    @Override
    public double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public String toString() {
        return String.format("%s\narea: %.3f and perimeter: %.3f", super.toString(), getArea(), getPerimeter());
    }
}
