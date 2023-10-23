package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("---------------------------------------------------------------");

        String[] days = {"Mon", "tue", "wed", "thu", "fri", "sat", "sun"};

        System.out.println(Arrays.toString(days));

        int num = 5;

        if (num < 1 || num > 7) {
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[num - 1]);

        for (int i = 0; i < 7; i++) {
            System.out.println(days[i]);

        }
    }
}
