package Chapter10;

import java.lang.ref.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class Ex10_17 {
    public static void main(String[] args) {


        BigInteger squared = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger num = new BigInteger(String.valueOf(Long.MAX_VALUE));
        int count = 0;

        squared = squared.sqrt();

        while (count < 10) {
            if (squared.pow(2).compareTo(num) > 0) {

                    System.out.println(squared);
                    count++;
            }
            squared = squared.add(BigInteger.ONE);
        }


        System.out.println(new BigInteger("3037000500").pow(2));

        System.out.println(num);
    }
}
