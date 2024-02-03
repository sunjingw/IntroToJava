package Chapter21;

import java.util.*;

public class Ex21_01 {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        Set<String> set1Clone = (HashSet<String>)set1.clone();
        Set<String> set2Clone = (HashSet<String>)set2.clone();

        set1Clone.addAll(set2Clone);
        System.out.println("Union: \n" + set1Clone);

        System.out.println();
        set1Clone = (HashSet<String>)set1.clone();
        set2Clone = (HashSet<String>)set2.clone();
        set1Clone.removeAll(set2Clone);
        System.out.println("Difference: \n" + set1Clone);

        System.out.println();
        set1Clone = (HashSet<String>)set1.clone();
        set2Clone = (HashSet<String>)set2.clone();
        set1Clone.retainAll(set2Clone);
        System.out.println("Intersection: \n" + set1Clone);

    }
}
