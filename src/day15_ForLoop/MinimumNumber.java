package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num < min)
                min = num;

        }

        System.out.println(min);
    }
}
