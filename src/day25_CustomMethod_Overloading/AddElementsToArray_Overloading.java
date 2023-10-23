package day25_CustomMethod_Overloading;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        addElements(arr, 5);


        String[] arr3 = {"kjfb", "hsh", "rtwwww", "fgg"};

        addElements(arr3, "dthxt");


        char[] arr4 = {'A', 'S', 'D', 'F'};

        addElements(arr4, 'T');

    }

    //1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addElements(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {

            result[i++] = each;
        }
        result[i] = element;

        return result;

        //array=new int[result.length];
        //array= Arrays.copyOf(result,i);


    }


    //	    2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElements(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {

            result[i++] = each;
        }
        result[i] = element;

        return result;

    }


    //	    3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElements(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {

            result[i++] = each;
        }
        result[i] = element;

        return result;


    }


    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElements(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {

            result[i++] = each;
        }
        result[i] = element;

        return result;


    }


}
