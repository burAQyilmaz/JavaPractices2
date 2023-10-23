package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str ="Java JAva Python Python";

        int frequency = 0;

        while (str.contains("Jaca")){
            str=str.replace("java","");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println("--------------------------------------");

        String sentence=" cat cat cat cat cat cat cat cat cat dog dog dog  cat cat";
        sentence=sentence.toLowerCase();

        int countCat=0;
        while (sentence.contains("cat")){

            sentence=sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);

    }
}
