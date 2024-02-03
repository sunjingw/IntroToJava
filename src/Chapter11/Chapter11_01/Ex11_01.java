package Chapter11.Chapter11_01;

import java.util.Scanner;

public class Ex11_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of triangle");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();

        input.nextLine();

        System.out.println("Enter a color ");
        String color = input.nextLine();

        System.out.println("Is balloon filled? true or false");
        boolean filled = input.nextBoolean();

        Triangle t = new Triangle(s1, s2, s3);
        t.setColor(color);
        t.setFilled(true);

        System.out.println(t.toString());
    }
}
