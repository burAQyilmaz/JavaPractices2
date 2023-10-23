package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        /*
        1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
         */

        String str = "AAABBBC";

        char ch = 'A';

        int freq = 0;

        for (int i = 0; i < str.length(); i++) {

            if (ch == str.charAt(i))
                freq++;


        }
        System.out.println(freq);

        //second sol:

        System.out.println(str.length() - str.replace("A", "").length());

    }
}
