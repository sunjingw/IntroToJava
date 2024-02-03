package Chapter10;

import java.util.Scanner;

public class Ex10_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Tax tax2001 = new Tax();

        int[][] bracket2001 = bracket2001();
        double[] rates2001 = rates2001();

        tax2001.setBrackets(bracket2001);
        tax2001.setRates(rates2001);

        final int MIN_INCOME = 50000;
        final int MAX_INCOME = 60000;
        final int INTERVAL = 1000;

        System.out.println(
                "\n2001 tax tables for taxable income from $50,000 to $60,000");
        print(tax2001, MIN_INCOME, MAX_INCOME, INTERVAL);



        Tax tax2009 = new Tax();
        int[][] bracket2009 = bracket2009();
        double[] rates2009 = rates2009();

        tax2009.setBrackets(bracket2009);
        tax2009.setRates(rates2009);
        System.out.println(
                "\n2009 tax tables for taxable income from $50,000 to $60,000");
        print(tax2009, MIN_INCOME, MAX_INCOME, INTERVAL);

    }
    public static void print(Tax tax, int min, int max, int interval) {

        System.out.println(
                "---------------------------------------------------------------------\n" +
                        "Taxable       Single      Married Joint       Married        Head of\n" +
                        "Income                    or Qualifying       Separate       a House\n" +
                        "                          Widow(er)\n" +
                        "---------------------------------------------------------------------");
        // Print Data
        for (double taxableIncome = min; taxableIncome <= max; taxableIncome += interval) {
            tax.setTaxableIncome(taxableIncome);
            System.out.printf("%-13.0f", taxableIncome);
            tax.setFilingStatus(tax.SINGLE_FILER);
            System.out.printf("%8.2f", tax.getTax());
            tax.setFilingStatus(tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
            System.out.printf("%15.2f", tax.getTax());
            tax.setFilingStatus(tax.MARRIED_SEPARATELY);
            System.out.printf("%18.2f", tax.getTax());
            tax.setFilingStatus(tax.HEAD_OF_HOUSEHOLD);
            System.out.printf("%15.2f\n", tax.getTax());
        }
    }

    public static int[][] bracket2001() {

        int[][] bracket = {
                {0, 27051, 65551, 136751, 297351},
                {0, 45201, 109251, 166501, 297361},
                {0, 22601, 54626, 83251, 148676},
                {0, 36251, 93651, 161651, 297351}
        };
        return bracket;
    }

    public static int[][] bracket2009() {

        int[][] bracket = {
                {0, 8351, 33951, 82251, 171551, 372951},
                {0, 16701, 67901, 137051, 208851, 372951},
                {0, 8351, 33951, 68526, 104426, 186476},
                {0, 11951, 45501, 117451, 190201, 372951}
        };
        return bracket;
    }

    public static double[] rates2001() {

        double[] rates = {15, 27.5, 30.5, 35.5, 39.1};
        return rates;
    }
    public static double[] rates2009() {
        double[] rates = {10, 15, 25, 28, 33, 35};
        return rates;
    }
}
