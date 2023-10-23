package day15_ForLoop;

import java.util.Scanner;

public class startsWith {
    public static void main(String[] args) {
        /*
        1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

         */


Scanner scan=new Scanner((System.in));
        System.out.println("Enter a word");
        String word =scan.nextLine();

        if(word.startsWith("x")){  //word.charAt(0)=='x'
            System.out.println(word.replaceFirst("x", "a"));

        }




    }
}
