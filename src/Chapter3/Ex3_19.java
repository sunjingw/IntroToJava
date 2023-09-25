package Chapter3;

import java.util.Scanner;

public class Ex3_19 {
    public static void main(String[] args) {

        //Compute the perimeter of a triangle
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of a triangle: ");

        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        double perimeter = 0;

        if (((s1 + s2) > s3) && ((s2 + s3) > s1) && ((s1 + s3) > s2)) {
            perimeter = s1 + s2 + s3;
            System.out.println("The perimeter is: " + perimeter);

        } else {
            System.out.println("The edges are invalid");
        }

    }
}
