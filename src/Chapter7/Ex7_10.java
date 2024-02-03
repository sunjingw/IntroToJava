package Chapter7;

import java.util.Scanner;

public class Ex7_10 {
    public static void main(String[] args) {

        //Find the index of the smallest element
        Scanner input = new Scanner(System.in);

        double[] num = new double[10];

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();

        }

        System.out.println("The smallest element index is " + indexOfSmallestElement(num));
    }

    public static int indexOfSmallestElement(double[] array) {

        int index = -1;
        double lowest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest)
                index = i;
        }

        return index;
    }
}
