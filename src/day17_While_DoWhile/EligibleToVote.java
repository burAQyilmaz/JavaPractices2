package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = scanner.nextInt();

        while (!(age >= 1 && age <= 120)) {

            System.err.println("Invalid entry, please re-enter");

            age = scanner.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String answer = scanner.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {

            System.err.println("Invalid entry, please re-enter");
            System.out.println("Are you a US citizen? yes/no");
            answer = scanner.next().toLowerCase();
        }

        if (age >= 18 && answer.equals("yes")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }
}
