package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers, 0 to terminate");
        int num;
        do {
            num = input.nextInt();
            list.add(num);
        } while (num != 0);

        System.out.println(max(list));
    }

    public static Integer max(ArrayList<Integer> list) {

        int max = 0;

        if (list.isEmpty() || list.size() == 0) {
            return null;
        } else {
            for (Integer e : list) {
                if (e > max) {
                    max = e;
                }
            }
            return max;
        }
    }
}
