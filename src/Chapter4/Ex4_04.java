package Chapter4;

import java.util.Scanner;

public class Ex4_04 {
    public static void main(String[] args) {

        //Geometry - area of a hexagon
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double s = input.nextDouble();

        double area = (6 * s * s) / ( 4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %1.2f ", area);
    }
}
