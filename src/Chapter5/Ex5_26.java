package Chapter5;

import java.util.Scanner;

public class Ex5_26 {
    public static void main(String[] args) {

        //Compute e
        Scanner input = new Scanner(System.in);

        double e = 1;
        double item = 1;

        for (int i = 1; i <= 10000; i++) {
            item = 1;
            for (int j = i; j >= 1; j--) {
                item *= j;
            }
            e += (1 / item);
        }

        System.out.println(e);
        System.out.println(Math.E);
    }
}
