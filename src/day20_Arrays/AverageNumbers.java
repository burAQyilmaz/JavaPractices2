package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {

        /*
        4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.err.println("ınvalid Entry");
            System.exit(0);
        }
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbers.length;

        System.out.println(Arrays.toString(numbers));
        System.out.println(average);

        scanner.close();
    }
}
