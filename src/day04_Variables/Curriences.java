package day04_Variables;

public class Curriences {
    public static void main(String[] args) {

        int dollar=1000;

        double lira= dollar * 18.89;
        double euro= dollar * 0.94;
        double jpy= dollar * 136.69;
        double pound= dollar * 0.82;
        double peso= dollar * 18.31;
        double cad= dollar * 0.74;
        double riyal= dollar * 3.75;

        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("peso = " + peso);
        System.out.println("cad = " + cad);
        System.out.println("riyal = " + riyal);

    }
}
