package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        /*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String name = scanner.nextLine();

        System.out.println("Enter your building number: ");

        String buildNum = scanner.next();

        scanner.nextLine();

        System.out.println("Enter your Street name: ");

        String street = scanner.nextLine();

        System.out.println("Enter your city name");

        String city = scanner.nextLine();

        System.out.println("Enter your state: ");

        String state = scanner.nextLine();

        System.out.println("Enter your zip code: ");

        String zip = scanner.next();

        scanner.nextLine();

        System.out.println(name);
        System.out.print(buildNum+" ");
        System.out.println(street);
        System.out.print(city+", ");
        System.out.print(state+" ");
        System.out.print(zip);


    }
}
