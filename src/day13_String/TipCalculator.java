package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
        2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party
and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String split = scan.next().toLowerCase();

        System.out.println("Enter the number of people");
        int people = scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next().toLowerCase();

        double tipRate = (quality.equals("excellent")) ? 0.25 : (quality.equals("great")) ? 0.20 : (quality.equals("good")) ? 0.15 : (quality.equals("fair")) ? 0.20 : 0.05;

        double totalTip = amount * tipRate;

        System.out.println("\t\t\tNumber of people entered: " + people +
                "\n\t\t\tTotal to pay: " + amount + "\n" +
                "\t\t\tTotal tip: " + totalTip);
        if (split.equals("yes")) {
            System.out.println("\t\t\tTotal per person: " + amount / people + "\n" +
                    "\t\t\tTip per person: " + totalTip / people);
        }
        scan.close();
    }
}