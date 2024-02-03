package Chapter10;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex10_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;

        String s = "1";
        for (int i = 0; i < 50; i++) {
            s += "0";
        }

        BigDecimal num = new BigDecimal(s);

        while (count < 10) {

            if (num.remainder(BigDecimal.TWO).equals(BigDecimal.ZERO) || num.remainder(new BigDecimal(3)).equals(BigDecimal.ZERO)) {
                count++;
                System.out.println(num);
            }

            num = num.add(BigDecimal.ONE);

        }




    }
}
