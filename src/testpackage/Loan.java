package testpackage;

public class Loan
{
    private double loan_money;
    private int amount_of_years;
    private double percentage;

    public Loan(double loan_money, int amount_of_years, double percentage)
    {
        this.loan_money = loan_money;
        this.amount_of_years = amount_of_years;
        this.percentage = percentage;
    }


    public double getTotalPayment()
    {
        return (((loan_money*(percentage / 100))*amount_of_years)+loan_money);
    }

    public double getYearPayment()
    {
        return (((loan_money*(percentage / 100))*amount_of_years)+loan_money) / amount_of_years;
    }
}
