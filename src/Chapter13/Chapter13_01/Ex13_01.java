package Chapter13.Chapter13_01;

import java.util.*;

public class Ex13_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        GeometricObject triangle = new Triangle(n1, n2, n3, "blue", true);

        System.out.println(triangle);

    }
}
