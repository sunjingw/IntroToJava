package Chapter10;

import java.util.Scanner;

public class Tax {
    private int filingStatus;
    public final int SINGLE_FILER = 0;
    public final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public final int MARRIED_SEPARATELY = 2;
    public final int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {

    }
    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;

    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {


        this.taxableIncome = taxableIncome;
    }
    public double getTax() {
        //calculate taxes based off of the first two 2001 tax rate
        double taxes = ((taxableIncome - brackets[filingStatus][1]) * rates[1]/100) + ((brackets[filingStatus][1] - 1) * rates[0]/100);

        return taxes;

    }

}
