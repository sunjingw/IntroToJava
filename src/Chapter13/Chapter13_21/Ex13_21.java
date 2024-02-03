package Chapter13.Chapter13_21;

import java.util.*;
public class Ex13_21 {
    public static void main(String[] args) {

        //Algebra - vertex form equations
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        Rational r = new Rational(a, b, c);

        System.out.println("h is " + r.h() + " k is " + r.k());

    }
}
