public class ProductManager extends Employee {
    private int vacationTime;
    private int stockOptions;

    public ProductManager() {
        setBaseSalary(getBaseSalary()*2);

    }

    public ProductManager(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
        setBaseSalary((getBaseSalary()*2));
    }

    public int getVacationTime() {
        setVacationTime();
        return vacationTime;
    }

    public void setVacationTime() {
        if(getYearsAtCompany() >= 2){
            vacationTime = 28;
        }
        else if(getYearsAtCompany() == 1){
            vacationTime = 21;
        }

    }

    public int getStockOptions() {
        setStockOptions();
        return stockOptions;
    }

    public void setStockOptions() {
        this.stockOptions = getYearsAtCompany() * 100;
    }

    @Override
    public String toString(){
        return super.toString() + "\nVacation Days: " + getVacationTime() +
                "\nStock Options: " + getStockOptions();
    }

    @Override
    public String motto(){
        return "There is nothing so useless as doing efficiently that which " +
                "should not be done at all.";
    }
}

