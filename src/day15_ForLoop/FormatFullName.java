package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        /*
        3. Write a program that asks user to enter first and last names, and then prints the full name in regular format
        (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */
        System.out.print("Input your first name: ");
        String firstName = new Scanner(System.in).next();

        System.out.print("Input your last name: ");
        String lastName = new Scanner(System.in).next();


        System.out.println("Full name is: "+firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase()
                + " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase());

    }
}
