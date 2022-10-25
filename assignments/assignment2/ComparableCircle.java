public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
    public ComparableCircle() {
        this(0);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, boolean filled, String color) {
        super(radius, color, filled);
    }

    @Override
    public boolean equals(Object object) {
        boolean result = false;
        if (object instanceof GeometricObject)
            if (getArea() == ((GeometricObject) object).getArea())
                result = true;
        return result;
    }

    @Override
    public int compareTo(GeometricObject geometricObject) {
        int result;
        double currentArea = getArea();
        double goemetricArea = geometricObject.getArea();

        if (currentArea > goemetricArea)
            result = 1;
        else if (currentArea < goemetricArea)
            result = -1;
        else
            result = 0;
        return result;
    }
}
