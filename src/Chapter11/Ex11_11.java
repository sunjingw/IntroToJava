package Chapter11;

import java.util.*;

public class Ex11_11 {
    public static void main(String[] args) {

        //Sort ArrayList
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int num;
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            num = input.nextInt();

            list.add(num);
        }

        sort(list);

        for (Integer e : list) {
            System.out.print(e + " ");
        }
    }

    public static void sort(ArrayList<Integer> list) {

        int temp;
        int index = 0;

        for (int i = 0; i < list.size(); i++) {

            temp = list.get(i);

            for (int j = i; j < list.size(); j++) {

                if (list.get(j) < temp) {
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
