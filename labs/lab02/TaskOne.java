import java.util.Scanner;

public class TaskOne {
    public static double letterGrade2Number(String grade) {
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
            default:
                numericValue = 0.0;
                break;
        }
        return numericValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students?");
        int studentNumber = input.nextInt();

        String grade;
        double summation = 0.0;

        System.out.printf("Enter %d letter grades:\n", studentNumber);
        for (int i = 0; i < studentNumber; i++) {
            grade = input.next();
            summation += letterGrade2Number(grade);
        }

        double gpa = summation / studentNumber;
        System.out.printf("GPA = %.2f\n", gpa);

        input.close();
    }
}
