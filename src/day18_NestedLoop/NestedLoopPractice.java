package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age");
            int age = scanner.nextInt();

            while (!(age < 1 && age >= 120)) {
                System.err.println("Invalid entry, please re enter");
            }
            System.out.println("Would you like to continue?");
            String answer = scanner.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, please re enter");
                answer = scanner.next();
            }
            if (answer.equals("no"))
                break;
        }
        scanner.close();
    }
}
