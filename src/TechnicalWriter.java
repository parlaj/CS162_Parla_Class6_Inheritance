public class TechnicalWriter extends Employee {
    private int vacationTime;

    public TechnicalWriter() {

    }

    public TechnicalWriter(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);

    }

    public int getVacationTime() {
        setVacationTime();
        return vacationTime;
    }

    public void setVacationTime() {
        if(getYearsAtCompany() >= 2){
            vacationTime = 2;
        }
        else if(getYearsAtCompany() == 1){
            vacationTime = 1;
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
        return "Name: " + getName() + "\n" + "Salary: " +
                getBaseSalary() + "\n" + "Motto: " + motto() + "\n" + "Vacation Days: " + getVacationTime();
    }
    @Override
    public String motto(){
        return "You can always edit a bad page. You can’t edit a blank page.";
    }
}
