package day10_Nestedif;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 85;

        if (s >= 0 && s <= 100) {

            if (s >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
        } else {
            System.out.println("Invalid Score");
        }

        String result = (s >= 0 && s <= 100)? (s >= 60)? "passed" : "failed" : "Invalid Score";

        System.out.println(result);


    }
}
