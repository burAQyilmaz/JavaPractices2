package day30_CustomClass;

public class Dog {
    /*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */

    public String name;
    public String breed;

    public int age;
    public char gender;

    public String size;
    public String color;


    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){

        dogName=name;
        dogBreed=breed;
        dogAge=age;
        dogGender=gender;
        dogSize=size;
        dogColor=color;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
