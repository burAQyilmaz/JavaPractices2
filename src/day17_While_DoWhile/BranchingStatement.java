package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {

        for (char i = 'A'; i <='Z' ; i++) {

            System.out.print(i + " ");

            if (i == 'F')
                break;

        }

            System.out.println("--------------------------------");

            Scanner scanner=new Scanner(System.in);

            while (true){

                System.out.println("Enter a number");
                int num= scanner.nextInt();

                if(num<0)
                    break;

            }
    }
}
