package Chapter13.Chapter13_19;

import java.math.BigInteger;
import java.util.*;
import Chapter13.Chapter13_15.Rational;

public class Ex13_19 {
    public static void main(String[] args) {

        //Convert decimals to fractions
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        String num = input.nextLine();

        String[] nums = num.split("[.]");

        System.out.println(Arrays.toString(nums));

        Rational r1 = new Rational(BigInteger.valueOf(Long.parseLong(nums[1])), BigInteger.valueOf(100));
        r1.addNumerator(BigInteger.valueOf(Long.parseLong(nums[0])));

        System.out.println(r1.getNumerator() + "/" + r1.getDenominator());

    }
}
