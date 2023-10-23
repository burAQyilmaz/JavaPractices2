package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Cydeo", "School");

        System.out.println("---------------------------------------");

        domain("cydeo@amazon.com");


        String[] emails = {"cydeo123@amazon123.com", "123cydeo@123amazon.com", "cydeobbbbbb@amazonbbbb.com", "aaaacydeo@aaaaamazon.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("---------------------------------------");

        nameOfMonth(11);

        System.out.println("---------------------------------------");

    }


    // 1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        initial = initial.toUpperCase();

        System.out.println("initial = " + initial);

    }


    // 2. Create a method that can display the domain of the email
    public static void domain(String email) {

        String domain = email.substring(email.lastIndexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {

        String name = "";

        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }


    // 4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number) {

        String name = "";

        if (number >= 1 && number <= 7) {
            name = (number == 1) ? "mon" : (number == 2) ? "tue" : (number == 3) ? "wed" : (number == 4) ? "thu" : (number == 5) ? "fri" : (number == 6) ? "sat" : "sun";
        } else {
            name = "Invalid";
        }

        System.out.println("Day name = " + name);
    }


// 5. Create a method that can print how many days a month has

    public static void daysInMonth(int number) {

        int dayOfMonth = 0;

        int year = 0;
        if (year % 4 != 0) {

            if (number >= 1 && number <= 12) {
                dayOfMonth = (number == 1 && number == 3 && number == 5 && number == 7 && number == 8 && number == 10 && number == 12) ? 31 : (number == 2) ? 28 : 30;
            } else {
                System.out.println("Invalid");
            }
        } else {
            if (number >= 1 && number <= 12) {
                dayOfMonth = (number == 1 && number == 3 && number == 5 && number == 7 && number == 8 && number == 10 && number == 12) ? 31 : (number == 2) ? 29 : 30;
            } else {
                System.out.println("Invalid");
            }
        }            System.out.println("dayOfMonth = " + dayOfMonth);
    }


    //ageGroups (int age)

    public static void ageGroups(int age){

        String group = "";

        if (age >= 1) {
            group = (age >= 1 && age<=2) ? "infant" : (age >=3  && age<=5) ? "toddler" : (age >=6  && age<=9) ? "kid" : (age >=10  && age<=12) ? "pre-tee" : (age >=13  && age<=17) ? "teen"
                    : (age >=18  && age<=20) ? "young adult" : (age >=21  && age<=39) ? "adult" : (age >=40  && age<=49) ? "Young Middle-Aged Adult" : (age >= 50 && age<=54) ? "Middle-Aged Adult" : (age >=55  && age<=64) ? "Very Young Senior Citizen"
                    : (age >= 65 && age<=74) ? "Young Senior Citizen" : (age >= 75 && age<=84) ? "Senior Citizen" : "Old Senior Citizen";
        } else {
            group = "Invalid";
        }

        System.out.println("group = " + group);
    }

}


   /*
        Warmup tasks:
        1. Create a method that can display the initials of the person

        2. Create a method that can display the domain of the email

        3. Create a method that can display the name of the month based on the given number to the method

        4. Create a method that can print the name of the day based on the given number to the method

        5. Create a method that can print how many days a month has

        6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
*/