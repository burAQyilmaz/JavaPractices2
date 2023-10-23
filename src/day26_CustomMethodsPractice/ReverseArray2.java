package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class ReverseArray2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(reverse(arr));
    }

    public static int[] reverse(int[] array) {

        int[] result = {};

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result= ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }








}
