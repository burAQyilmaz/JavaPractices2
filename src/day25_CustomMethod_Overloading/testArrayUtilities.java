package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class testArrayUtilities {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------");

        String[] arr3 = {"kjfb", "hsh", "rtwwww", "fgg"};

        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------------");

        char[] arr4 = {'A', 'S', 'D', 'F'};

        ArraysUtility.printEachElement(arr4);

        System.out.println("---------------------");

        int[] numbers = {1, 2, 65, 333, 2, 67};

        System.out.println(ArraysUtility.max(numbers));

        System.out.println("---------------------");

        double[] prices = {34.5, 12.1, 56.9};

        System.out.println(ArraysUtility.max(prices));

        System.out.println("---------------------");

        System.out.println(ArraysUtility.contains(arr3, "fsa"));

        System.out.println(ArraysUtility.contains(arr1, 5));

        System.out.println(ArraysUtility.contains(arr4, 'A'));

        System.out.println(ArraysUtility.contains(prices, 5.0));

    }

}
