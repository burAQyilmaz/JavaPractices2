package day18_NestedLoop;

public class DivideToNumbers {
    public static void main(String[] args) {

        /*
        1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the reaminder of 2


                        a = 20
                        b = 6;


                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2


                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
                        }
         */

        int a = 20,
                b = 6;

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count);
    }
}
