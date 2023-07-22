package entities;

public class Company extends TaxPayer{

    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double taxPayer;
        if (numberOfEmployees > 10) {
            taxPayer = getAnualIncome() * 0.14;
        }
        else {
            taxPayer = getAnualIncome() * 0.16;
        }
        return taxPayer;
    }
}
