package Chapter2;

import java.util.Scanner;

public class Ex2_18 {
    public static void main(String[] args) {

        //Print a table
        Scanner input = new Scanner(System.in);


        System.out.println("a    b    pow(a, b)");
        System.out.println("1    2    " + (int)Math.pow(1, 2));
        System.out.println("2    3    " + (int)Math.pow(2, 3));
        System.out.println("3    4    " + (int)Math.pow(3, 4));
        System.out.println("4    5    " + (int)Math.pow(4, 5));
        System.out.println("5    6    " + (int)Math.pow(5, 6));

    }
}
