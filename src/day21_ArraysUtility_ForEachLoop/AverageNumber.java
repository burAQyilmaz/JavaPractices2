package day21_ArraysUtility_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {

        int[] numbers ={10,20,30,40,50,60};

        double sum= 0;

        for (int number : numbers) {

            sum+=number;
        }
        System.out.println(sum/ numbers.length);
    }
}
