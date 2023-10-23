package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String fullName = scanner.nextLine();

        System.out.println("Enter your programming language: ");

        String progLang = scanner.nextLine();

        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        scanner.nextLine(); //buffer

        System.out.println("Enter your school name: ");

        String school = scanner.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("progLang = " + progLang);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
    }
}
