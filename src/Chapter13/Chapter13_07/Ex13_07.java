package Chapter13.Chapter13_07;

import java.util.*;

public class Ex13_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GeometricObject[] obj = new GeometricObject[5];

        obj[0] = new Square(5, "blue", true);
        obj[1] = new Square(3, "", false);
        obj[2] = new Square(4, "red", true);
        obj[3] = new Square(6, "", false);
        obj[4] = new Square(2, "green", false);

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].getArea() + " ");
            obj[i].howToColor();
            System.out.println();
        }

    }
}
