package Chapter11;

import java.util.*;

public class Ex11_14 {
    public static void main(String[] args) {

        //Combine two lists
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            list1.add(num);
        }
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            list2.add(num);
        }

        ArrayList<Integer> combinedList = union(list1, list2);

        for (Integer e : combinedList) {
            System.out.print(e + " ");
        }

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combinedArr = new ArrayList<>();
        combinedArr.addAll(list1);

        for (int i = 0; i < list2.size(); i++) {
            combinedArr.add(list2.get(i));
        }

        return combinedArr;
    }
}
