package Chapter5;

import java.util.Scanner;

public class Ex5_39 {
    public static void main(String[] args) {

        //Financial application - find the sales amount
        Scanner input = new Scanner(System.in);

        //Base is 5,000

        //0.01 to 5,000 = 8%

        //5,000.01 to 10,000 = 10%

        //10,000.01+ = 12%

        //How much sales to achieve 30,000 / year?

        double sales = 10000;
        double goal = 25000;
        double commission = 0;

        while (commission < goal) {
            commission = (5000 * 0.08) + (5000.01 * .10) + (sales * 0.12);
            sales++;
        }

        System.out.println("sales = $" + (sales + 5000 + 5000)); //$210000 sales returns $25000 commission + $5000 base = $30000 salary


    }
}
