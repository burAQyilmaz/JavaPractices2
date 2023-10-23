package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        /*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age ( int --> nextInt() )
			2. Enter your gender (String- One word ONLY --> next())  nextLine()
			3. Enter your full name (String- Multiple words --> nextLine())
			4. Enter your phone number (long --> nextLong())
			5. Enter your zip code (int --> nextInt())   nextLine()
			6. Enter your School name (String- Can be Multiple words --> nextLine())
			7. Enter your city name (String- Can be Multiple words--> nextLine() )
			8. Enter your state name (String- One word ONLY --> next())
			9. Enter your building number (int --> nextInt())  nextLine()
			10. Enter your Street name ( nextLine() )
		MAKE SURE USER CAN ENTER ALL THE INPUT
		Display all the inputs that user entered in following order in sperate lines:
			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode
			6. school name
 */

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age= scanner.nextInt();

        System.out.println("Enter your gender: ");

        String gender = scanner.next();

        scanner.nextLine();

        System.out.println("Enter your full name: ");

        String name= scanner.nextLine();

        System.out.println("Enter your phone number: ");

        long phone = scanner.nextLong();

        System.out.println("Enter your zip code: ");

        int zip = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your School name: ");

        String school= scanner.nextLine();

        System.out.println("Enter your city name: ");

        String city= scanner.nextLine();

        System.out.println("Enter your state name: ");

        String state = scanner.next();

        System.out.println("Enter your building number: ");

        int build= scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your Street name: ");

        String street = scanner.nextLine();

        scanner.close();

        System.out.println("full name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone number = " + phone);
        System.out.println("Adress: \t");
        System.out.print(build+" ");
        System.out.println(street +"\t");
        System.out.print(city+", ");
        System.out.print(state+" ");
        System.out.println(zip);
        System.out.println("school name = " + school);



    }
}
