package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {

        /*
        8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
         */



        String word = "Nalan";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reversed += word.charAt(i);

        }
        boolean result=true;
        if (word.equalsIgnoreCase(reversed)) {

            System.out.println(result);

        } else{

            result=false;

            System.out.println(result);}

    }

}
