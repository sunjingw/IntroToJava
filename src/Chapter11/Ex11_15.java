package Chapter11;

import java.util.*;

public class Ex11_15 {
    public static void main(String[] args) {

        //Area of a convex polygon
        Scanner input = new Scanner(System.in);

        ArrayList<Double> x = new ArrayList<>();
        ArrayList<Double> y = new ArrayList<>();

        for (int i = 0; i < 14; i++) {
            double num = input.nextDouble();
            if (i % 2 == 0) {
                x.add(num);
            } else
                y.add(num);
        }

        System.out.println(area(x, y));
    }

    public static double area(ArrayList<Double> x, ArrayList<Double> y) {

        double xTotal = 0;
        double yTotal = 0;

        for (int i = 0; i < x.size(); i++) {

            if (i == x.size() - 1) {
                xTotal += x.get(i) * y.get(x.size() - x.size());
                yTotal += y.get(i) * x.get(x.size() - x.size());
            } else {
                xTotal += x.get(i) * y.get(i + 1);
                yTotal += y.get(i) * x.get(i + 1);
            }

        }

        return 0.5 * (xTotal - yTotal) * -1;
    }

}
