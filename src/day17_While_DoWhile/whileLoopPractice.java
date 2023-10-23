package day17_While_DoWhile;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {

       /*
       2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to
                have three attempts to enter correct credentials and if all three attempts are failed,
                then print "Your account is locked."

    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scanner.next();

        System.out.println("Enter your password");
        String p = scanner.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {

            System.out.println("Logged in");
        } else {
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {

                if (attempts == 1) {   //YOU HAVENT THIS CONDITION!!!
                    System.out.println("THİS İS YOUR LAST CHANCE");
                }
                System.err.println("Incorrect username or password, please re-entry");
                System.out.println("Enter your username:");
                u = scanner.next();

                System.out.println("Enter your password");
                p = scanner.next();
                attempts--;
            }

            if (u.equals("Cydeo") && p.equals("Cydeo123")) {

                System.out.println("Logged in");
            } else {
                System.out.println("Your account is locked");
            }
            scanner.close();
        }
    }
}
