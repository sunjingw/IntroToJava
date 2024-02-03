package Chapter13;

import java.util.*;

public class Ex13_03 {
    public static void main(String[] args) {

        //Sort ArrayList
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int random = (int)(Math.random() * 20);
            list.add(random);
        }
        System.out.println(list);

        sort(list);

        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list) {

        for (int i = 0; i < list.size(); i++) {
            Number temp = list.get(i);
            int index = i;
            for (int j = i; j < list.size(); j++) {
                if ((int)list.get(j) < (int)temp) {
                    temp = list.get(j);
                    index = j;
                }
            }
            if (index != i) {
                list.set(index, list.get(i));
                list.set(i, temp);
            }
        }

    }
}
