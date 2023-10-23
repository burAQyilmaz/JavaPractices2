package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // > , >=, <, <=

        boolean result1 = 20 > 40;

        System.out.println("result1 = " + result1); //false

        boolean result2 = 300 >= 159;

        System.out.println("result2 = " + result2);; //true

        System.out.println("------------------------------------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x==y;

        System.out.println("equal = " + equal); // false

        boolean result3= 'A' == 'a';

        System.out.println("result3 = " + result3); // false  ASCII

        boolean result4 = "java" == "java";

        System.out.println("result4 = " + result4); //true

        boolean result5 =  100 != 200.5;

        System.out.println("result5 = " + result5); // true

        boolean result6 =    300 != 300;

        System.out.println("result6 = " + result6);//false








    }
}
