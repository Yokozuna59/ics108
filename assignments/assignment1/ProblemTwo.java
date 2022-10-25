import java.util.Scanner;

public class ProblemTwo {
    public static boolean isSortedConstantInterval(int[] array) {
        // Assume the array is ascending orded
        boolean isaAcendingOrdered = true;

        // Check if the array length is greater than 1
        if (array.length > 1) {
            // Calculate the difference of the first element from the second element
            int difference = array[1] - array[0];

            /*
             * Do a for loop until isaAcendingOrdered is false
             * Or if the loop reaches the before the last element of array
             */
            for (int i = 0; (isaAcendingOrdered) && (i < array.length - 1); i++) {
                /*
                 * Check if the current element is greater than the next element
                 * Or if the current difference doesn't equal the original difference
                 */
                if ((array[i] > array[i + 1]) || (difference != (array[i + 1] - array[i])))
                    // Set isaAcendingOrdered as false
                    isaAcendingOrdered = false;
            }
        }

        // Return isaAcendingOrdered
        return isaAcendingOrdered;
    }

    public static void main(String[] args) throws Exception {
        // Create Scanner object for inputs
        Scanner input = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter list: ");
        int arraySize = input.nextInt();

        // Create an array with size from the user input
        int[] array = new int[arraySize];

        // Fill the array with user inputs
        for (int index = 0; index < arraySize; index++) {
            array[index] = input.nextInt();
        }

        // Check if the array is sorted with a constant interval
        if (isSortedConstantInterval(array))
            // Print the list is sorted with a constant interval
            System.out.println("The list is sorted with a constant interval");
        else
            // Print the list is not sorted with a constant interval
            System.out.println("The list is not sorted with a constant interval");

        // Close Scanner object
        input.close();
    }
}
