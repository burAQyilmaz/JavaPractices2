package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        /*
        2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
         */

        String str = "aabccdeef";
        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int counter = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);

                if (ch == each)
                    counter++;
            }
            if (counter == 1)   //if(counter != 1) continue;
                result += ch;
        }
        System.out.println(result);
    }
}
