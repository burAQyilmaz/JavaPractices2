package day31_Constructors.scrumTask;

public class Tester {

    /*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(),  toString()
 */

    public System name;
    public int employeeID;
    public System jobTitle;

    public double salary;


    public Tester(System name, int employeeID, System jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Tester(String layan, int employeeID, String qa, int salary) {
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name=" + name +
                ", employeeID=" + employeeID +
                ", jobTitle=" + jobTitle +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

}
