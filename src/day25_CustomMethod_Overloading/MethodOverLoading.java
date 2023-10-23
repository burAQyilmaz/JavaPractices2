package day25_CustomMethod_Overloading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodOverLoading {
    public static void main(String[] args) {

        int[] intArray = {3, 4, 2, 4, 7, 8};
        Arrays.sort(intArray);

        double[] doubleArray = {10.2, 34.4, 65.1, 90.2};
        Arrays.sort(doubleArray);

        char[] charArray = {'F', 'G', 'J', 'K', 'Y'};
        Arrays.sort(charArray);


        System.out.println("---------------------------------");

        int sum2 = sumOfNumbers(10, 20);

        int sum3 = sumOfNumbers(10, 20, 30);

        int sum4 = sumOfNumbers(10, 20, 30, 40);


        double sum5 = sumOfNumbers(18.2, 34.5);

        double sum6 = sumOfNumbers(18.2, 34.5, 56.7);

        double sum7 = sumOfNumbers(18.2, 34.5, 65.4, 32.1);


    }


    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return sumOfNumbers(num1, num2) + num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return sumOfNumbers(num1, num2) + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return sumOfNumbers(num1, num2, num3) + num4;
    }
}
