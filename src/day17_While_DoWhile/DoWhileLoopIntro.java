package day17_While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;


        for (int i = 0; a; i++) {

            System.out.println("Wooden Spoon -- for Loop");

        }

        System.out.println("-----------------------------------");

        while (a) {

            System.out.println("Wooden Spoon -- While Loop");
        }

        System.out.println("-----------------------------------");

        do {
            System.out.println("Wooden Spoon -- do while loop");
        } while (a);
    }
}

