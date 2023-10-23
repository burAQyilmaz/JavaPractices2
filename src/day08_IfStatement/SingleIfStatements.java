package day08_IfStatement;

public class SingleIfStatements {
    public static void main(String[] args) {

        int number = 300;

        boolean evenNumber = number % 2 == 0;
        boolean oddnumber = !evenNumber;

        if (evenNumber) {
            System.out.println(number + " is even number");
        }
        if (oddnumber) {
            System.out.println(number + " is odd number");
        }
        System.out.println("-------------------------------------------");

        int n = 200;

        if (n > 0) {
            System.out.println(n + " is positive");
        }
        if (n < 0) {
            System.out.println(n + " is negative");
        } else {
            System.out.println(n + " is zero");
        }

    }
}
