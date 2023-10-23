package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {

        String name= "James Black",
                buildingNumber= "11821B",
                streetName= "Jones branch Dr",
                city= "Mclean",
                state= "VA",
                zipcode= "22031A";

        System.out.println(name+ "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " +   zipcode);

        String adress= name+ "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " +   zipcode;
        System.out.println(adress);
    }
}
