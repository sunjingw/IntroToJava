package Chapter9;

import java.util.Scanner;

public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String s, String n) {
        symbol = s;
        name = n;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}
