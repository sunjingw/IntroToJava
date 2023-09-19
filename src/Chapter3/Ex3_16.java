package Chapter3;

import java.util.Scanner;

public class Ex3_16 {
    public static void main(String[] args) {

        //Random point
        Scanner input = new Scanner(System.in);

        int x1 = -(int)(Math.random() * 101);
        int x2 = (int)(Math.random() * 100);

        int y1 = -(int)(Math.random() * 200);
        int y2 = (int)(Math.random() * 200);

        System.out.println("(" + x1 + ", " + y2 + ")  (" + x2 + ", " + y2 + ")  (" + x2 + ", " + y1 + ")  (" + x1 + ", " + y1 + ")");
    }
}
