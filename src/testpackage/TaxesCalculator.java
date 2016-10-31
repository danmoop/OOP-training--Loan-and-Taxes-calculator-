package testpackage;

public class TaxesCalculator
{
    private double yourMoney;
    private double statePercentage;

    public TaxesCalculator(double yourMoney, double statePercentage)
    {
        this.yourMoney = yourMoney;
        this.statePercentage = statePercentage;
    }

    public double getResult()
    {
        return yourMoney - (yourMoney * (statePercentage / 100));
    }
}
