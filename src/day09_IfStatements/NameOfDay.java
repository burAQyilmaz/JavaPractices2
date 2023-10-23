package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

        int n = 5; //1 - 7

        if(n == 1){
            System.out.println("Monday");
        }else if (n == 2) {
            System.out.println("Tuesday");

        }else if (n == 3) {
            System.out.println("Wednesday");

        }else if (n == 4) {
            System.out.println("Thursday");

        }else if (n == 5) {
            System.out.println("Friday");

        }else if (n == 6) {
            System.out.println("Saturday");

        }else if (n == 7) {
            System.out.println("Sunday");

        } else {
            System.out.println("Invalid");
        }

        int i = 7;
        String day;

        if (i == 1) {
            //System.out.println("Monday");
            day = "Monday";
        } else if (i == 2) {
            //System.out.println("Tuesday");
            day = "Tuesday";
        } else if (i == 3) {
            //System.out.println("Wednesday");
            day = "Wednesday";
        } else if (i == 4) {
            //System.out.println("Thursday");
            day = "Thursday";
        } else if (i == 5) {
            //System.out.println("Friday");
            day = "Friday";
        } else if (i == 6) {
            //System.out.println("Saturday")
            day = "Saturday";
        } else if (i == 7) {
            //System.out.println("Sunday");
            day = "Sunday";
        }else{
            day = "invalid";
            System.out.println("Out of range");
        }
        System.out.println("day = " + day);

    }
}
