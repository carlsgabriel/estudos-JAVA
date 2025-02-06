package entities;

public class Individual extends TaxPayer{

    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public final double taxCalculation() {
        if(getAnnualIncome() < 20000.00){
            double calc = (getAnnualIncome() * 0.15) - (healthExpenditures * 0.50);
            return calc;
        } else {
            double calc = (getAnnualIncome() * 0.25) - (healthExpenditures * 0.50);
            return calc;
        }
    }

    @Override
    public String toString(){
        return getName() + ": $ " + String.format("%.2f", taxCalculation());
    }

}
