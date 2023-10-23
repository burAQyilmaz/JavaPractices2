package day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {

        nameOfDay(6);
    }

    // 4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number) {

        if (number < 1 || number > 7) {
            System.out.println("Invalid");
            return;
        }
        if (number == 1) System.out.println("mon");
        else if (number == 2) System.out.println("tue");
        else if (number == 3) System.out.println("wed");
        else if (number == 4) System.out.println("thu");
        else if (number == 5) System.out.println("fri");
        else if (number == 6) System.out.println("sat");
        else System.out.println("sun");


    }
}
