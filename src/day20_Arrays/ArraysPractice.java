package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        char[] letters = new char[26];

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {

            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters));

        for (int i = 0, j = 'A'; i < letters.length; i++, j++) {

            letters[i] = (char) j;
        }
        System.out.println(Arrays.toString(letters));

        char ch = 'A';

        for (int i = 0; i < letters.length; i++, ch++) {

            letters[i] = ch;
           
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------------------------------");

        char[] alphabets = new char[26];

        char chr = 'Z';

        for (int i = 0; i < alphabets.length; i++, chr--) {

            alphabets[i] = chr;

        }
        System.out.println(Arrays.toString(alphabets));

        for (int i = 0, j = 'Z'; i < alphabets.length; i++, j--) {

            alphabets[i] = (char) j;
        }
        System.out.println(Arrays.toString(alphabets));



    }
}
