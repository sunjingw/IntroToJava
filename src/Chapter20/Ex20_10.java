package Chapter20;

import java.util.*;

public class Ex20_10 {
    public static void main(String[] args) {

        Collection<String> list1 = copy1();
        Collection<String> list2 = copy2();

        System.out.println("union = " + list1.addAll(list2) + " " + list1);

        list1 = copy1();
        list2 = copy2();
        System.out.println("difference = " + list1.removeAll(list2) + " " + list1);


        list1 = copy1();
        list2 = copy2();
        System.out.println("intersection = " + list1.retainAll(list2) + " " + list1);
    }

    private static PriorityQueue<String> copy1() {

        PriorityQueue<String> list1 = new PriorityQueue<>();
        list1.add("George");
        list1.add("Jim");
        list1.add("John");
        list1.add("Blake");
        list1.add("Kevin");
        list1.add("Michael");

        return list1;
    }

    private static PriorityQueue<String> copy2() {

        PriorityQueue<String> list2 = new PriorityQueue<>();
        list2.add("George");
        list2.add("Katie");
        list2.add("Kevin");
        list2.add("Michelle");
        list2.add("Ryan");

        return list2;
    }
}
