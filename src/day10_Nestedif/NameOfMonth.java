package day10_Nestedif;

public class NameOfMonth {
    public static void main(String[] args) {

        int number = 15;
        String result ="";


            if(number==1)result="Jan";
            else if (number==2) result="Feb";
            else if (number==3) result="mar";
            else if (number==4) result="apr";
            else if (number==5) result="may";
            else if (number==6) result="jun";
            else if (number==7) result="jul";
            else if (number==8) result="aug";
            else if (number==9) result="sep";
            else if (number==10) result="oct";
            else if (number==11) result="nov";
            else  result="dec";

        System.out.println(result);
    }
}
