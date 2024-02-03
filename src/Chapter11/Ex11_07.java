package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers, 0 to terminate");
        int num;
        do {
            num = input.nextInt();
            list.add(num);
        } while (num != 0);

        System.out.println(list.toString());
        shuffle(list);
        System.out.println(list.toString());
    }

    public static void shuffle(ArrayList<Integer> list) {
        int temp;
        for (int i = 0; i < list.size(); i++) {
            int random = (int) (Math.random() * list.size());


            temp = list.get(i);
            list.add(i, list.get(random));
            list.remove(i+1);

            list.remove(random);
            list.add(random, temp);

        }
    }
}
