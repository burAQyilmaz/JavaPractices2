package day06_PrimitiveTypeCasting;

public class ArithmeticsOperators {
    public static void main(String[] args) {

        System.out.println("12"+ 1); //121, concatenation

        System.out.println(10+20); //30, addition
        System.out.println(100-50); //50, subtraction
        System.out.println(10*5); //50, multiplication

        System.out.println(10/4); //2, division
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0);  //2.5
        System.out.println(10d/4);  //2.5
        System.out.println((double) 10/4);

        int a = 100;
        double b = a/6;  //16.0
        System.out.println(b);

        double c = a/6.0;  //16.66666
        System.out.println(c);

        System.out.println(100D); //100.0

        

        /*
        +: Addition
        -: Subtract
        *: Multiplication
        /: Division
                integer/integer====>integer
                decimal/integer====>decimal
                integer/decimal====>decimal
                decimal/decimal====>decimal

                in math:
                    10/4=2.5

                in java:
                    10/4=2
                    10.0/4=2.5
        %: Remainder
         */

    }
}

