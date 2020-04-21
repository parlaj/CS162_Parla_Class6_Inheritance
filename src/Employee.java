/**
 * Employee.java - Employee Benefits Management
 * @author Kimberly Bryant
 * @version 1
 */
public class Employee {
    private String name;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;

    /**
     * Parameterless constructor
     */
    public Employee(){
        name = "";
        baseSalary = 50000;
        yearsOfExperience = 0;
        yearsAtCompany = 0;

    }

    /**
     * Parameterless constructor
     *@param name A variable of type String
     *@param yearsOfExperience A variable of type int
     */
    public Employee(String name, int yearsOfExperience){
        this.name = name;
        baseSalary = 50000;
        this.yearsOfExperience = yearsOfExperience;
        yearsAtCompany = 0;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }


    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return "Name: " + name + "\nSalary: $" + baseSalary + "\nMotto: " + motto();
     }
    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "We value our employees";
    }
}