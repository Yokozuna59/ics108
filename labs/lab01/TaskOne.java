import java.util.Scanner;
import java.lang.Math;

public class TaskOne {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSlides = input.nextInt();

        System.out.print("Enter the side: ");
        double sideLength = input.nextFloat();

        double area = (numberOfSlides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSlides));
        System.out.printf("The area of the polygon is %.14f\n", area);

        input.close();
    }
}
