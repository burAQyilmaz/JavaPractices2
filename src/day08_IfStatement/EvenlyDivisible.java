package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        //2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
        //    		Ex:
        //				number = 65;
        //
        //			output:
        //				65 is divisible by 2: false
        //				65 is divisible by 3: false
        //				65 is divisible by 5: true

        int number = 65;

        boolean divisibleBy2 = 65 % 2 == 0;

        System.out.println(number+ " is divisible by 2 " +divisibleBy2); //true

        System.out.println("----------------------------------------------------------");

        int year = 2000;

        boolean isLeapYear = year % 4 == 0;

        System.out.println(year+ " is leap year " +isLeapYear); //true


    }
}
