package day21_ArraysUtility_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};


        for (String each : words) {

            int counter = 0;

            for (String element : words) {

                if (element.equals(each))
                    counter++;
            }
            if(counter==1)
                System.out.println(each); 
        }

    }
}
