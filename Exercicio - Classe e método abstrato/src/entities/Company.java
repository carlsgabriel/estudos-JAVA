package entities;

public class Company extends TaxPayer {
    private Integer employee;

    public Company(){
        super();
    }

    public Company(String name, Double annualIncome, Integer employee) {
        super(name, annualIncome);
        this.employee = employee;
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }

    @Override
    public final double taxCalculation() {
        if(employee > 10){
            return getAnnualIncome() * 0.14;
        } else {
           return getAnnualIncome() * 0.16;
        }
    }

    @Override
    public String toString(){
        return getName() + ": $ " + String.format("%.2f", taxCalculation());
    }
}
