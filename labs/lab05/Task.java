import java.lang.Exception;
import java.lang.String;
import java.lang.System;

public class Task {
    public static void main(String[] args) throws Exception {
        Point pointOne = new Point();
        Point pointTwo = new Point(10, 30.5);

        double distance = pointOne.distance(pointTwo);
        System.out.println(distance);
    }
}
