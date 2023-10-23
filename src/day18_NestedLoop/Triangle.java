package day18_NestedLoop;

public class Triangle {
    public static void main(String[] args) {

        /*
        Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
         */

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
