package day16_ForLoopStringPractice;

public class DigitsLettersSpecialCharacters {
    public static void main(String[] args) {

        /*
         5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */

        String word = "lkngfoı856735jnfdgn-iorg56-**gmf.,o";

        String letters = "";
        String digits = "";
        String specials = "";

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                letters += ch;

            } else if (ch >= '0' && ch <= '9') {

                digits += ch;

            } else {
                if (ch != ' ')
                    specials += ch;
            }
        }
        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("special chars: " + specials);

    }
}
