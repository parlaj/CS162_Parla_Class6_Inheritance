/**
 * TechnicalWriter.java - Employee Benefits Management
 * @author Jacob Parla
 * @version 1
 */
public class TechnicalWriter extends Employee {
    private int vacationTime;

    /**
     * Parameterless constructor
     */
    public TechnicalWriter() {

    }

    /**
     * Parametered constructor
     * @param name a String data type
     * @param yearsOfExperience an int data type
     */
    public TechnicalWriter(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);

    }

    public int getVacationTime() {
        setVacationTime();
        return vacationTime;
    }

    public void setVacationTime() {
        if(getYearsAtCompany() >= 2){
            vacationTime = 14;
        }
        else if(getYearsAtCompany() == 1){
            vacationTime = 7;
        }
        else{
            vacationTime = 0;
        }
    }
    /**
     * Returns the employees name, salary, motto, and vacation days
     * @return A value of data type String
     */
    @Override
    public String toString(){
        return super.toString() + "\nVacation Days: " + getVacationTime();
    }
    @Override
    public String motto(){
        return "You can always edit a bad page. You can’t edit a blank page.";
    }
}
