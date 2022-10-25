public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Return area */
    public double getArea() {
        return width * height;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object rectangle) {
        boolean result = false;
        if (rectangle instanceof Rectangle)
            if (getArea() == ((Rectangle) rectangle).getArea())
                result = true;
        return result;
    }

    @Override
    public int compareTo(Rectangle rectangle) {
        rectangle.equals(rectangle);
        int result;
        double currentArea = getArea();
        double anotherArea = rectangle.getArea();

        if (currentArea > anotherArea)
            result = 1;
        else if (currentArea < anotherArea)
            result = -1;
        else
            result = 0;
        return result;
    }
}
