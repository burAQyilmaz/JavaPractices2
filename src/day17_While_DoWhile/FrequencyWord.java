package day17_While_DoWhile;

public class FrequencyWord {
    public static void main(String[] args) {

        /*
        2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3

           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)

        	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"
         */
        String str = "JavaJavaJavaJava";

        int frequency=0;

        for (int i = 0; i < str.length()-3; i++) {

           String eachSub= str.substring(i,i+4);

            System.out.println(eachSub);

            if(eachSub.equals("Java"))
            frequency++;
        }
        System.out.println("frequency = " + frequency);

    }
}
