package lab17;

import java.util.Scanner;

public class Task {
    public static double numericGradeValue(String grade) throws Exception {
        double numericValue;
        switch (grade) {
            case "A+":
                numericValue = 4.0;
                break;
            case "A":
                numericValue = 3.75;
                break;
            case "B+":
                numericValue = 3.5;
                break;
            case "B":
                numericValue = 3.0;
                break;
            case "C+":
                numericValue = 2.5;
                break;
            case "C":
                numericValue = 2.0;
                break;
            case "D+":
                numericValue = 1.5;
                break;
            case "D":
                numericValue = 1.0;
                break;
            case "F":
                numericValue = 4.0;
                break;
            default:
                throw new Exception();
        }
        return numericValue;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String grade = input.next();
        try {
            System.out.println(numericGradeValue(grade));
        } catch (Exception exception) {
            System.out.println(String.format("%s is an invalid grade!", grade));
        } finally {
            input.close();
        }
    }
}
