package Chapter20;

import java.util.*;

public class Ex20_12 {
    public static void main(String[] args) {

        //clone PriorityQueue
        MyPriorityQueue<String> list1 = new MyPriorityQueue<>();

        list1.offer("Adam");
        list1.offer("John");
        list1.offer("Sam");
        list1.offer("Bob");

        System.out.println(list1.hashCode());

        MyPriorityQueue<String> list2 = list1.clone();
        System.out.println(list2.hashCode());




    }
}
