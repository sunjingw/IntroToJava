package Chapter9;

import java.util.Scanner;

public class Ex9_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.printf("Price change percent %2.2f%s", stock.getChangePercent() * 100, "%");
    }
}
