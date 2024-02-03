package Chapter13.Chapter13_16;

import java.util.*;

public class Ex13_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a rational number equation: ");
        String s = input.nextLine();
        String[] arr = s.split("[ /]");

        System.out.println(Arrays.toString(arr));

        Rational r1 = new Rational(parse(arr[0]), parse(arr[1]));
        Rational r2 = new Rational(parse(arr[3]), parse(arr[4]));

        String operation = arr[2];

        switch (arr[2]) {
            case "+": System.out.println(s + " = " + r1.add(r2));
                break;
            case "-": System.out.println(s + " = " + r1.subtract(r2));
                break;
            case "*": System.out.println(s + " = " + r1.multiply(r2));
                break;
            case "/": System.out.println(s + " = " + r1.divide(r2));
                break;
        }
    }

    public static Integer parse(String s) {
        return Integer.parseInt(s);
    }
}
