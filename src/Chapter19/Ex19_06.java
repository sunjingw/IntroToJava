package Chapter19;

import java.util.*;

public class Ex19_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer[][] list = new Integer[2][2];

        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list[i].length; k++) {
                list[i][k] = input.nextInt();
            }
        }

        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list[i].length; k++) {
                if (list[i][k].compareTo(max) > 0) {
                    max = list[i][k];
                }
            }
        }
        return max;
    }
}
