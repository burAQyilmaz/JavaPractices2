package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        /*
        1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
         */

        String str = "Wooden Spoon";

        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);
        }

        System.out.println(reverse);


    }

}
