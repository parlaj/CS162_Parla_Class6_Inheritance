/**
 * Engineer.java - Employee Benefits Management
 * @author Jacob Parla
 * @version 1
 */
public class Engineer extends Employee{
    private int vacationTime;
    private int signOnBonus;

    /**
     * Parameterless constructor
     */
    public Engineer() {
        setBaseSalary(getBaseSalary()*1.5);
        if(getYearsOfExperience() >= 5){
            signOnBonus = 10000;
        }
        else{
            signOnBonus = 5000;
        }

    }

    /**
     * Parametered Constructor
     * @param name a String data type
     * @param yearsOfExperience an int data type
     */
    public Engineer(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
        setBaseSalary(getBaseSalary()*1.5);

        if(getYearsOfExperience() >= 5){
            signOnBonus = 10000;
        }
        else if(getYearsOfExperience() < 5){
            signOnBonus = 5000;
        }

    }

    public int getVacationTime() {
        setVacationTime();
        return vacationTime;
    }

    public void setVacationTime() {
        if(getYearsAtCompany() >= 2){
            vacationTime = 21;
        }
        else if(getYearsAtCompany() == 1){
            vacationTime = 14;
        }

    }

    public int getSignOnBonus() {
        return signOnBonus;
    }

    public void setSignOnBonus() {
        if(getYearsOfExperience() >= 5){
            signOnBonus = 10000;
        }
        else{
            signOnBonus = 5000;
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nVacation Days: " + getVacationTime() +
                "\nSign-On Bonus: " + signOnBonus;
    }

    @Override
    public String motto(){
        return "To the optimist, the glass is half full. To the pessimist, the glass " +
                "is half empty. To the engineer, the glass is twice as big as it needs to be.";
    }
}
