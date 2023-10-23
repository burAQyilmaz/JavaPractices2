package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter true or false: ");

        boolean result = scanner.hasNextBoolean();


        System.out.println("Enter Your name: ");

        String name= scanner.next(); //reads the input until a space

        System.out.println("name = " + name);
    }
}
