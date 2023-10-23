package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steve";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println( name+ " is eligible to vote: " +isEligible);//false


        String name2 = "Shay";

        int age2 = 21;
        char gender = 'F';

        boolean isEligible2 = age2 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println(name2 + "is eiligble to register: " +isEligible2);//true



        boolean result2 = true;
        boolean result3 = !result2;

        System.out.println("result3 = " + result3); //false



    }
}
