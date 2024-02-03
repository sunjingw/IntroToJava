package Chapter19;

import java.util.*;

public class Ex19_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer[] list = {2, 3, 6, 5, 9, 6, 2};
        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E max (E[] list) {
        E max = list[0];

        for (E e : list) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }
}
