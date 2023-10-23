package day22_MultiDimensionalArray;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence="Today is a good day to learn Java";

        String[] words=sentence.split(" ");
        
        String reversedSentence="";

        for (int i = words.length-1; i >=0 ; i--) {

            reversedSentence+=words[i]+" ";
        }
        System.out.println(reversedSentence);
    }
}
