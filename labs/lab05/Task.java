public class Task {
    public static void main(String[] args) {
        Point pointOne = new Point();
        Point pointTwo = new Point(10, 30.5);

        double distance = pointOne.distance(pointTwo);
        System.out.println(distance);
    }
}
