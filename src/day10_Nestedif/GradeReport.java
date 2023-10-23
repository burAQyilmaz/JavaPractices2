package day10_Nestedif;

public class GradeReport {
    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                System.out.println("excellent");
            } else if (score >= 80) {
                System.out.println("great");
            } else if (score >= 70) {
                System.out.println("good");
            } else if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

        } else {
            System.out.println("Invalid score");
        }







    }
}
