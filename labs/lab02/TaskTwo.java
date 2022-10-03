import java.lang.Math;
import java.lang.Exception;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class TaskTwo {
    public static String randomGrade() {
        String grade;
        int randomInt = (int) (Math.random() * 9);
        switch (randomInt) {
            case 0:
                grade = "A+";
                break;
            case 1:
                grade = "A";
                break;
            case 2:
                grade = "B+";
                break;
            case 3:
                grade = "B";
                break;
            case 4:
                grade = "C+";
                break;
            case 5:
                grade = "C";
                break;
            case 6:
                grade = "D+";
                break;
            case 7:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        return grade;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("How many letter grades?");
        int studentNumber = input.nextInt();
        String grade;

        for (int i = 0; i < studentNumber; i++) {
            grade = TaskTwo.randomGrade();
            System.out.println(grade);
        }

        input.close();
    }
}
