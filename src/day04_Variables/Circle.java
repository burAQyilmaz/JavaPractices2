package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        /*
        3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
         */

    double PI=3.14;
    double radius= 5;
    double diameter= 8;

    double area = radius * radius * PI;
    double Perimeter = 2 * radius * PI;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);

        System.out.println("area = " + area);
        System.out.println("Perimeter = " + Perimeter);



    }



}
