package Chapter13.Chapter13_17;

import java.util.*;

public class Ex13_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first complex number: ");
        String s1 = input.nextLine();

        System.out.println("Enter the second complex number: ");
        String s2 = input.nextLine();

        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        Complex c1 = new Complex(Double.parseDouble(arr1[0]), Double.parseDouble(arr1[1]));
        Complex c2 = new Complex(Double.parseDouble(arr2[0]), Double.parseDouble(arr2[1]));

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("(" + c1.toString() + ") + (" + c2.toString() + ") = " + c1.add(c2));
        System.out.println("(" + c1.toString() + ") - (" + c2.toString() + ") = " + c1.subtract(c2));
        System.out.println("(" + c1.toString() + ") * (" + c2.toString() + ") = " + c1.multiply(c2));
        System.out.println("(" + c1.toString() + ") / (" + c2.toString() + ") = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());

        Complex c3 = (Complex)c1.clone();
        System.out.println(c1 == c3);
        System.out.println(c3.getRealPart());
        System.out.println(c3.getImaginaryPart());
        Complex c4 = new Complex(4, -0.5);
        Complex[] list = {c1, c2, c3, c4};
        java.util.Arrays.sort(list);
        System.out.println(java.util.Arrays.toString(list));
    }
}
