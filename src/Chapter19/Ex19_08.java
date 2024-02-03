package Chapter19;

import java.util.*;

public class Ex19_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        shuffle(list);

        System.out.println(list);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Random index = new Random();

        for (int i = 0; i < list.size(); i++) {
            E temp = list.get(i);
            int n = index.nextInt(10);
            list.set(i, list.get(n));
            list.set(n, temp);

        }

    }
}
