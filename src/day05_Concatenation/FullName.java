package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName="Jimmy";
        String lastName="King";
        int age=45;
        String jobTitle= "SDET";
        String companyName= "Apple INC";
        double salary= 10000.58;


        String fullName= firstName +" "+ lastName;
        System.out.println("Full name of the person is " +fullName+ "." );

        System.out.println(fullName+ " is "+ age+ " years old.");

        System.out.println(fullName+" is " +jobTitle+ " , works at "+companyName+ " and "+fullName+ "'s salary is $"+ salary+ ".");

    }
}
