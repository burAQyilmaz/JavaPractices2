package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("enter a Number");
            int num = scanner.nextInt();

            if (num % 2 == 0)
                System.out.println("Even number");
            else System.out.println("Odd number");

            System.out.println("Would you like to enter another number? (yes/no");
            String answer = scanner.next();

            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you !");
                break;
            }
        }

        scanner.close();
    }
}
