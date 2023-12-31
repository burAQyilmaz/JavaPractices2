package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxnumbers {
    public static void main(String[] args) {

        /*
        3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
         */

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (max < numbers[i]) max = numbers[i];
            if (min > numbers[i]) min = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(max);
        System.out.println(min);

        scanner.close();
    }
}
