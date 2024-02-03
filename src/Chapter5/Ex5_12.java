package Chapter5;

import java.util.Scanner;

public class Ex5_12 {
    public static void main(String[] args) {

        //Find the smallest n such that n^2 > 12000
        Scanner input = new Scanner(System.in);

        int n = 100;

        while ((Math.pow(n, 2)) < 12000) {
            n++;
        }

        System.out.println(n);
    }
}
