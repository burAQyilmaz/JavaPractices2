package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {10, 9, 0, 1, 2, 20, 4, 6, 7, 8};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println("min number: " + numbers[0]);
        System.out.println("max number: " + numbers[numbers.length - 1]);

        System.out.println("------------------------------------------------------");

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] names1 = {"Anna", "ANNA"};

        Arrays.sort(names1); //ANNA, Anna

        System.out.println(Arrays.toString(names1));

        System.out.println("------------------------------------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1); //false

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1, arr2);

        System.out.println(r2); //true

        System.out.println("------------------------------------------------------");

        //"acb" , "abc"
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'a', 'b', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram=Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);





    }
}
