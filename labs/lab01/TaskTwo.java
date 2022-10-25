import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("How many student? ");
        int studentNumber = input.nextInt();

        double summation = 0.0;
        String letterGrade;

        System.out.printf("Enter %d letter grades: \n", studentNumber);
        for (int i = 0; i < studentNumber; i++) {
            letterGrade = input.next().toUpperCase();

            if (letterGrade.equals("A+"))
                summation += 4.0;
            else if (letterGrade.equals("A"))
                summation += 3.75;
            else if (letterGrade.equals("B+"))
                summation += 3.5;
            else if (letterGrade.equals("B"))
                summation += 3.0;
            else if (letterGrade.equals("C+"))
                summation += 2.5;
            else if (letterGrade.equals("C"))
                summation += 2.0;
            else if (letterGrade.equals("D+"))
                summation += 1.5;
            else if (letterGrade.equals("D"))
                summation += 1.0;
            else if (letterGrade.equals("F"))
                summation += 0.0;
        }

        double gpa = summation / studentNumber;
        System.out.printf("GPA = %f\n", gpa);

        input.close();
    }
}
