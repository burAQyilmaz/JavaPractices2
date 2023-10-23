package day17_While_DoWhile;

import java.util.Scanner;

public class cydeo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {// if credentials are valid
            System.out.println("Logged in");

        } else {// if credentials are not valid
            int attempt = 3;

            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0) {//while the credentials are invalid and user has attempts to reenter
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your user name");
                username = scan.next();

                System.out.println("Enter your password");
                password = scan.next();
                attempt--;
            }
            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account is logged");

            }
        } scan.close();
    }
}
