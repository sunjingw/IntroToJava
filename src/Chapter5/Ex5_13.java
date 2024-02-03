package Chapter5;

import java.util.Scanner;

public class Ex5_13 {
    public static void main(String[] args) {

        //Find the largest n such that n^3 < 12000
        Scanner input = new Scanner(System.in);

        int n = 20;

        while ((Math.pow(n, 3)) < 12000) {
            n++;
        }
        System.out.println(n-1);
    }
}
