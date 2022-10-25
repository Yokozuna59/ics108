import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        boolean filled = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double sideOne = input.nextInt();
        double sideTwo = input.nextInt();
        double sideThree = input.nextInt();

        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        System.out.print(
                "Enter 'filled' or 'not filled' (without quotations) to indicate whether the triangle is filled: ");
        String filledString = input.next();
        if (filledString.equals("filled"))
            filled = true;
        else if (filledString.equals("not filled"))
            filled = false;
        else
            System.out.println("Not supported input! The program uses the default (false).");

        Triangle testTriangle = new Triangle(sideOne, sideTwo, sideThree, color, filled);
        System.out.println(testTriangle);

        input.close();
    }
}
