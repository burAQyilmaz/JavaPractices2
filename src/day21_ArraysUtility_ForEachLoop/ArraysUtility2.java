package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", " James", "Aaron", "Daniel"};

        String[] earlybirds = Arrays.copyOf(students, 3); //Elif, Sinem, Gunay

        System.out.println(Arrays.toString(earlybirds));

        System.out.println("----------------------------------------------------");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = Arrays.copyOf(numbers, 5);

        System.out.println(Arrays.toString(numbers));//1,2,3,4,5

        System.out.println("----------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6);//C,D,E,F

        System.out.println(Arrays.toString(ch2));

        System.out.println("----------------------------------------------------");

        int[] scores={10,20,30,40,50,60,70,80,90};

        int[] result=Arrays.copyOfRange(scores,3,7+1); // 40,50,60,70

        System.out.println(result);

        
    }
}
