package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

// find the max number between 100 & 200

        int maxNumber = max(12, 34);

        System.out.println(maxNumber);

        // multiply the max number by 2

        int multiplication = maxNumber * 2;

        System.out.println(multiplication);
    }

    private static int max(int a, int b) {

        int result = 0;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
