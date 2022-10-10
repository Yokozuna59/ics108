import java.lang.Exception;
import java.lang.String;
import java.lang.System;

public class Task {
    public static void main(String[] args) throws Exception {
        Student[] students = {
                new Graduate(123456, 4.0),
                new Undergraduate(234561, 3.0)
        };

        for (Student student : students)
            System.out.println(student);
    }
}
