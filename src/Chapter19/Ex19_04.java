package Chapter19;

import java.util.*;

public class Ex19_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer[] list = new Integer[5];
        for (int i = 0; i < 5; i++) {
            list[i] = input.nextInt();
        }

        Integer key = input.nextInt();

        System.out.println(linearSearch(list, key));

    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }
}
