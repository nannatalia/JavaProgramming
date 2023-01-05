package day31_Constructors.Practice;

public class SalaryCalculator {
    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return hourlyRate*weeklyHours*52;
    }
    public double stateTax(){
        return (hourlyRate*weeklyHours*52) * stateTaxRate/100;
    }
    public double federalTax(){
        return (hourlyRate*weeklyHours*52) * federalTaxRate/100;
    }
    public double salaryAfterTax(){
        return (hourlyRate*weeklyHours*52) - federalTax()-stateTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours + ", salary= " + salary() + ", stateTax= " + stateTax() + ", federalTax= " + federalTax() + ", salary after Tax= " + salaryAfterTax() +
                '}';
    }
}
