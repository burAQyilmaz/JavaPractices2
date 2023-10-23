package day08_IfStatement;

public class SwapToVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        //1. write a program that can swipe two variables' value by using a temporary variable
        //
        //		    Ex:
        //		        if a= 10, b=15
        //
        //		    output:
        //		        a = 15
        //		        b = 10

        int a = 10;
        int b = 15;

        int c = b;
        b = a;
        a = c;

        System.out.println("a = " + a); //15
        System.out.println("b = " + b); //10

    }
}
