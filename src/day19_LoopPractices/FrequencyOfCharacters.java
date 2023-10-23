package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        /*
        1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
         */





























        String str = "aabcccd";

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);

            int counter = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if (ch == each)
                    counter++;
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += counter;
        }
        System.out.println(result);
    }
}
