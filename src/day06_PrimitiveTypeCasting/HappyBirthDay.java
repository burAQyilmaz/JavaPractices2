package day06_PrimitiveTypeCasting;

import java.time.LocalDate;

public class HappyBirthDay {
    public static void main(String[] args) {

        happyBirthDay(1995,4, 24);
    }

    private static void happyBirthDay(int year, int month, int day) {

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();
        int year2 = today.getDayOfYear();

        if(month2==month && day == day2)
            System.out.println("Happy Birthday To You!!!");
        else {
            System.out.println("Today is not your birthday.");
        }



    }
}
