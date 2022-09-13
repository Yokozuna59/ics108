import java.util.Scanner;

public class Task {
    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] askAboutList(Scanner input, int listNumber) {
        System.out.printf("Enter list%d size\n", listNumber);
        int listSize = input.nextInt();

        int listInt[] = new int[listSize];
        System.out.printf("Enter list%d\n", listNumber);

        for (int i = 0; i < listSize; i++)
            listInt[i] = input.nextInt();
        return listInt;
    }

    public static void main(String[] args) {
        int listOneInt[], listTwoInt[];

        Scanner input = new Scanner(System.in);

        listOneInt = Task.askAboutList(input, 1);
        listTwoInt = Task.askAboutList(input, 2);

        boolean arrayEquality = Task.equals(listOneInt, listTwoInt);
        if (arrayEquality)
            System.out.println("list1 and list2 are equal");
        else
            System.out.println("list1 and list2 are not equal");

        input.close();
    }
}
