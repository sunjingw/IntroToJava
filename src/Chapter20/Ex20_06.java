package Chapter20;

import java.util.*;

public class Ex20_06 {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        System.out.println("Test using Iterator");
        Iterator<Integer> iterator = list.iterator();

        long start = System.currentTimeMillis();
        while (iterator.hasNext()) {
            Integer a = iterator.next();
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");


        //TOO LONG
        System.out.println("Test using for loop");
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }
}
