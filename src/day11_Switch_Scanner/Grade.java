package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        /*
        3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
         */

        char ch = 'B';

        switch (ch) { // A B C D F
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
                break;

                /*
                if the grade is A or B or C or D ===> "Passed"
                otherwise ===> "Failed"
                 */


            /*
            switch (ch){ // TODO why?

                case 'A': case 'B': case 'C': case 'D':

                    System.out.println("Passed");
                    break;

                case 'F':
                    System.out.println("Failed");
                    break;

                default:
                    System.out.println("Invalid");
                    break;

            }*/

        }
    }
}
