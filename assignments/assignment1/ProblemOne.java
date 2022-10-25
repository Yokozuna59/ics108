import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) throws Exception {
        // Create a final integer specifies the range of inputs
        final int INPUT_RANGE = 50;

        // Specify the types of variables
        int currentInput, currentOccurrence;

        // Create an array specifies the number of occurrence of each integer occurred
        // from the input range
        int[] occurrence = new int[INPUT_RANGE];

        // Create Scanner object for inputs
        Scanner input = new Scanner(System.in);

        // Ask for unknown number of integers until 0 occurs
        System.out.print("Enter the integers between 1 and 50: ");
        currentInput = input.nextInt();
        while (currentInput > 0) {
            // Add one for occurrence of the input
            occurrence[currentInput - 1]++;

            // Ask for another input
            currentInput = input.nextInt();
        }

        for (int index = 0; index < occurrence.length; index++) {
            currentOccurrence = occurrence[index];

            // Check if the number of occurrence is 1
            if (currentOccurrence == 1)
                // Print the number of occurrence of current index + 1
                System.out.printf("%d occurs 1 time\n", index + 1);
            // Check if the number of occurrence is more than 1
            else if (currentOccurrence > 1)
                // Print the number of occurrence of current index + 1 with the number of
                // occurrence
                System.out.printf("%d occurs %d times\n", index + 1, currentOccurrence);
        }

        // Close Scanner object
        input.close();
    }
}
