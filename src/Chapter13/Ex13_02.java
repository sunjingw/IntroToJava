package Chapter13;

import java.util.*;

public class Ex13_02 {
    public static void main(String[] args) {

        //Shuffle ArrayList
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int random = (int)(Math.random() * 20);
            list.add(random);
        }
        System.out.println(list);

        shuffle(list);

        System.out.println(list);
    }

    public static void shuffle(ArrayList<Number> list) {

        for (int i = 0; i < list.size(); i++) {
            int random = (int)(Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(random));
            list.set(random, temp);

        }
    }
}
