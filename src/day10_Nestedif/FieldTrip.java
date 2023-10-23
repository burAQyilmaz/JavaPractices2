package day10_Nestedif;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 2;
        String location ="";
        int groupNumber = 0;
        String teacher = "";

        if(grade>=1 && grade<= 6){

            if(grade == 1){
                location= "Apple orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            }else if(grade == 2){
                location= "zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }else if(grade == 3){
                location= "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            }else if(grade == 4){
                location= "Movie theater";
                groupNumber = 2;
                teacher = "Ms. Reyes";
            }else if(grade == 5){
                location= "museum";
                groupNumber = 5;
                teacher = "Ms. Lela";
            }else {
                location= "Six flags";
                groupNumber = 8;
                teacher = "Mr. Watt";
            }
        }else {
            System.out.println("Invalid grade");
        }

        System.out.println("location - " + location+"\ngroupNumber - " + groupNumber +"\nteacher - " + teacher );




    }
}
