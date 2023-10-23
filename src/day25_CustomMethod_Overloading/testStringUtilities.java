package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class testStringUtilities {
    public static void main(String[] args) {

        StringUtility.printEachChar("burak");

        System.out.println("-----------------------------");

        String s1 = "akfnaook";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("-----------------------------");

        String word = "nalan";

        System.out.println(StringUtility.isPalindrome(word));

        System.out.println("-----------------------------");

        String[] names = {"Anna", "Java", "racecar", "Mom", "Cydeo"};

        int counter = 0;

        for (String name : names) {

            if (StringUtility.isPalindrome(name)) counter++;
        }
        System.out.println(counter);

        System.out.println("-----------------------------");

        String text="aaabbbbbcccccccc";

        String nonDup=StringUtility.removeDuplicates(text);

        System.out.println(nonDup);
    }

}
