package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scanner.nextInt();

        System.out.println("Enter a math operator");
        char operator = scanner.next().charAt(0);

        if (!(operator == '+' || operator == '+'))
            System.err.println("Invalid Math Operator: " + operator);
        System.exit(0);

        System.out.println("Enter a number");
        int num2 = scanner.nextInt();

        if (operator == '+')
            System.out.println(num1 + num2);
        else System.out.println(num1 - num2);

        scanner.close();
    }
}
