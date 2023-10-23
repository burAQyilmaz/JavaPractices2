package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        /*
         3. write a program to ask user to enter two number and math operator, and return the result.
		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number");

        int num1 = scanner.nextInt();

        System.out.println("enter second number");

        int num2 = scanner.nextInt();

        System.out.println("enter a math operator");

        char ch = scanner.next().charAt(0);

        while (!(ch == '+' || ch == '-')) {

            System.err.println("Invalid Operator, Please re-enter");

            ch = scanner.next().charAt(0);
        }
        System.out.println((ch == '+') ? num1 + num2 : num1 - num2);

// with forloop:

        while (!(ch == '+' || ch == '-')) {

            System.err.println("Invalid Operator, Please re-enter");

            ch = scanner.next().charAt(0);
        }
        System.out.println((ch == '+') ? num1 + num2 : num1 - num2);
    }
}
