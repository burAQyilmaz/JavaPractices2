package day31_Constructors.scrumTask;

public class Developer {
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary
	          Add A constructor that can set all the fileds
	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */

    public System name;
    public int employeeID;
    public System jobTitle;

    public double salary;

    public Developer(System name, int employeeID, System jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Developer(String olga, int employeeID, String javaDeveloper, int salary) {
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name=" + name +
                ", employeeID=" + employeeID +
                ", jobTitle=" + jobTitle +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }

}
