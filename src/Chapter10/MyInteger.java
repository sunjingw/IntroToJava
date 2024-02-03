package Chapter10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *      MyInteger
 * -value: int
 * +MyInteger()
 * +MyInteger(value: int)
 * +getValue(): int
 * +isEven(): boolean
 * +isOdd(): boolean
 * +isPrime(): boolean
 * +static isEven(value: int): boolean
 * +static isOdd(value: int): boolean
 * +static isPrime(value: int): boolean
 * +static isEven(value: MyInteger): boolean
 * +static isOdd(value: MyInteger): boolean
 * +static isPrime(value: MyInteger): boolean
 *
 * +equals(value: int): boolean
 * +equals(value: MyInteger): boolean
 * +static parseInt(character: char[]): char[]
 * +static parseInt(string: String): int
 */
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isEven(){
        return isEven(value);
    }
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    public boolean isOdd() {
        return isOdd(value);
    }
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        return isPrime(value);
    }
    public static boolean isPrime(int value) {
        for (int i = 2; i < value/2; i++) {
            if (value % 2 == 0)
                return false;
        }

        return true;
    }

    public static boolean isEven(MyInteger v) {
        return v.isEven();
    }
    public static boolean isOdd(MyInteger v) {
        return v.isOdd();
    }
    public static boolean isPrime(MyInteger v) {
        return v.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }
    public boolean equals(MyInteger v) {
        return this.value == v.value;
    }
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
    public static int parseInt(char[] c) {
        return Integer.parseInt(String.valueOf(c));
    }
}
