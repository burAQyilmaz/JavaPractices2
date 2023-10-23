package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        /*
        2. Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enters invalid answer, repeat the previous steps
         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("Odd Number");
            } else {
                System.out.println("Even Number");
            }
            System.out.println("Would you like to enter another number");
            String answer = scanner.next();

            while (!(answer.equalsIgnoreCase("yes") || (answer.equalsIgnoreCase("no")))) {

                System.out.println("Invaid entry. please re enter");
                answer = scanner.next();
            }
            if (answer.equalsIgnoreCase("no"))
                break;
        }
        scanner.close();
    }
}
