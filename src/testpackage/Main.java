package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int yourCommand;

    private double loan_money;
    private int amount_of_years;
    private double percentage;

    private double yourMoney;
    private double statePercentage;

    public Main() throws IOException
    {
        System.out.println("Print 0 - for calculating a loan");
        System.out.println("Print 1 - for calculating your taxes");
        System.out.println("");
        System.out.print("What do you want to do: ");
        yourCommand = Integer.parseInt(reader.readLine());

        if (yourCommand == 0)
        {
            try
            {
                System.out.print("Write down money you want to take: ");
                loan_money = Integer.parseInt(reader.readLine());
                System.out.print("Write down amount of years: ");
                amount_of_years = Integer.parseInt(reader.readLine());
                System.out.print("Write down %: ");
                percentage = Integer.parseInt(reader.readLine());
                if (percentage > 100)
                    System.out.println("Loan percentage can't be greater than 100!");
                Loan l = new Loan(loan_money, amount_of_years, percentage);
                System.out.println("Your year payment is: " + (float)l.getYearPayment());
                System.out.println("Your total payment is: " + l.getTotalPayment());
            }
            catch (Exception e)
            {
                System.out.println("Unknown error.");
            }
        }

        else if (yourCommand == 1)
        {
            try
            {

                System.out.print("Write down your money: ");
                yourMoney = Integer.parseInt(reader.readLine());

                System.out.print("Write down state %: ");
                statePercentage = Integer.parseInt(reader.readLine());

                if (statePercentage > 100)
                    System.out.println("State percentage can't be greater than 100!");

                TaxesCalculator t = new TaxesCalculator(yourMoney, statePercentage);

                System.out.print("Your money after paying taxes: ");
                System.out.print(t.getResult());
            } catch (Exception e)
            {
                System.out.println("Unknown error.");
            }
        }

        else
            System.out.println("Unknown command");
    }

    public static void main(String[] args) throws IOException
    {
        new Main();
    }
}
