package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int[] reversed = new int[numbers.length];

/*
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = numbers[i];
        }
*/
        int i = 3;
        int j = 0;

        while (i>=0) {
            reversed[j++] = numbers[i--];
        }

        System.out.println(Arrays.toString(reversed));
    }
}
