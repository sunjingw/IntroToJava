package Chapter19;

import java.util.*;

public class Ex19_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Integer key = input.nextInt();

        System.out.println(binarySearch(list, key));

        System.out.println(recursionBinarySearch(list, key));
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int mid = list.length / 2;
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            if (key.compareTo(list[mid]) < 0) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else if (key.compareTo(list[mid]) == 0) {
                return mid;
            } else {
                low = mid + 1;
                mid = (low + high) / 2;
            }
        }
        return -1;
    }

    public static <E extends Comparable<E>> int recursionBinarySearch(E[] list, E key) {

        return recursionBinarySearch(list, 0, list.length/2, list.length-1, key);
    }

    public static <E extends Comparable<E>> int recursionBinarySearch(E[] list, int low, int mid, int high, E key) {

        if (low > high) {
            return -1;
        } else {
            if (key.compareTo(list[mid]) > 0) {
                low = mid + 1;
                mid = (low + high) / 2;
            } else if (key.compareTo(list[mid]) == 0) {
                return mid;
            } else {
                high = mid - 1;
                mid = (low + high) / 2;
            }
        }
        return recursionBinarySearch(list, low, mid, high, key);
    }
}
