package day21_ArraysUtility_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden School", "Early Birds", "Angry Birds"};

        for (String word : words) {

            System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));
        }
    }
}
