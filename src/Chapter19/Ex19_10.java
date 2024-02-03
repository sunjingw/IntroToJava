package Chapter19;

import java.util.*;

public class Ex19_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(30));
        }

        System.out.println(list);
        System.out.println(recursionMax(list));
//        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {

        E max = list.get(0);

        for (E e : list) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }

    public static <E extends Comparable<E>> E recursionMax(ArrayList<E> list) {

        E max = list.get(0);
        return recursionMax(list, list.size() - 1, max);
    }

    public static <E extends Comparable<E>> E recursionMax(ArrayList<E> list, int n, E max) {

        if (n < 0)
            return max;
        else {
            if (list.get(n).compareTo(max) > 0)
                max = list.get(n);
            return recursionMax(list, n - 1, max);
        }
    }

}
