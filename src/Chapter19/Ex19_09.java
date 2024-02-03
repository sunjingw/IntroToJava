package Chapter19;

import java.util.*;

public class Ex19_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(21));
        }

        //sort(list);
        recursionSort(list);
        System.out.println(list);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {

        for (int i = 1; i < list.size(); i++) {

            for (int k = i; k > 0; k--) {

                if (list.get(k).compareTo(list.get(k - 1)) < 0) {
                    E temp = list.get(k);
                    list.set(k, list.get(k - 1));
                    list.set(k - 1, temp);
                }
            }
        }
    }

    public static <E extends Comparable<E>> void recursionSort(ArrayList<E> list) {
        recursionSort(list, list.size() - 1);
    }

    public static <E extends Comparable<E>> void recursionSort(ArrayList<E> list, int n) {

        if (n < 1) {
            return;
        } else {

            recursionSort(list, n - 1);

            for (int i = n; i > 0; i--) {
                if (list.get(i).compareTo(list.get(i - 1)) < 0) {
                    E temp = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, temp);

                }
            }
        }
    }
}
