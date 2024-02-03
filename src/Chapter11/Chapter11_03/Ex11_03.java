package Chapter11.Chapter11_03;

import java.util.Scanner;

public class Ex11_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Checking c1 = new Checking(123, 100, 50);
        Savings s1 = new Savings(3223, 200);

        System.out.println(c1);
        System.out.println(s1);
    }
}
