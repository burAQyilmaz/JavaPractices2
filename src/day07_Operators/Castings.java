package day07_Operators;

public class Castings {
    public static void main(String[] args) {

        float averageScore = 20.5f;

        byte nu1 = (byte) averageScore; //explicit casting
        short nu2 = (short) averageScore; //explicit casting
        int num3 = (int) averageScore; //explicit casting
        float num4 = averageScore;  //no casting
        double num5 = averageScore; //implicit casting
        long num6 = (long) averageScore; //implicit casting


        System.out.println("nu1 = " + nu1);
        System.out.println("nu2 = " + nu2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);




    }
}
