package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            if (i == 'C')
                continue;

            System.out.println(i);

        }
        System.out.println("--------------------------------");

        //print all even numbers 1-10 (skip the odd numbers)

        for (int i = 1; i < 11; i++) {

            if (i % 2 != 0)
                continue;
            System.out.println(i);
        }

        System.out.println("--------------------------------");

        //print all odd numbers 1-10 (skip the even numbers)

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }
}
