package Chapter11;

import java.util.*;

public class Ex11_13 {
    public static void main(String[] args) {

        //Remove duplicates
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 integers");

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            list.add(num);
        }
        removeDuplicate(list);

        for (Integer e : list) {
            System.out.print(e + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }

    }
}
