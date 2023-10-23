package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter second number");
            int num2 = scanner.nextInt();

            System.out.println("Addition: " + (num1 + num2));

            System.out.println("Do you want to continue?");
            String answer = scanner.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("yes"))) {

                System.err.println("Invalid entry. Please re enter");
                answer = scanner.next().toLowerCase();
            }
            if (answer.equals("no"))
                break;
        } scanner.close();
    }
}
