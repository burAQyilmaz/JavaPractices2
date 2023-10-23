package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // 1. Circle:
        //            1.1 Ask the user to enter the radius of the circle
        //            1.1 Calculate the area and perimeter of the circle by using the radius

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the cicle: ");

        double r = scanner.nextDouble();

        scanner.close();

        double area = r * r * 3.14;
        double perimeter = 2 * 1 * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
