public class Engineer extends Employee{
    private int vacationTime;
    private int signOnBonus;

    public Engineer() {
        setBaseSalary(getBaseSalary()*1.5);
        if(getYearsOfExperience() >= 5){
            signOnBonus = 10000;
        }
        else{
            signOnBonus = 5000;
        }

    }

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
            vacationTime = 3;
        }
        else if(getYearsAtCompany() == 1){
            vacationTime = 2;
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
        return "Name: " + getName() + "\n" + "Salary: " +
                getBaseSalary() + "\n" + "Motto: " + motto() +
                "\n" + "Vacation Weeks: " + getVacationTime() + "\n" +
                "Sign-On Bonus: " + signOnBonus;
    }

    @Override
    public String motto(){
        return "To the optimist, the glass is half full.To the pessimist, the glass " +
                "is half empty.To the engineer, the glass is twice as big as it needs to be.";
    }
}
