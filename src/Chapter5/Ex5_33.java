package Chapter5;

import java.util.Scanner;

public class Ex5_33 {
    public static void main(String[] args) {

        //Perfect number
        Scanner input = new Scanner(System.in);

        int num = 0;

        for (int i = 1; i < 10000; i++) {
            //reset the num to nothing
            num = 0;

            //loop the number by dividing from itself to 1
            for (int j = i/2; j >= 1; j--) {
                if (i % j == 0) {
                    num += j;
                }
            }

            if (num == i)
                System.out.println("Perfect number " + i);

            }
        }
}
