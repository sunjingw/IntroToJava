package Chapter11;

import java.util.*;

public class Ex11_12 {
    public static void main(String[] args) {

        //Sum ArrayList
        Scanner input = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
         for (int i = 0; i < 5; i++) {
             double n = input.nextDouble();
             list.add(n);
         }

        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list) {

        double sum = 0;

        for (int i = 0; i < list.size(); i++) {

            sum += list.get(i);
        }

        return sum;
    }
}
