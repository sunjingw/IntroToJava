package Chapter19;

import java.util.*;

public class Ex19_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(input.nextInt());
        }

        System.out.println(removeDuplicates(list));
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

        ArrayList<E> newList = new ArrayList<>();

        for (E e : list) {
            if (!newList.contains(e)) {
                newList.add(e);
            }
        }

        return newList;
    }
}
