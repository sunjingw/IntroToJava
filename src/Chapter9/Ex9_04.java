package Chapter9;

import java.util.Scanner;
import java.util.Random;

public class Ex9_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            Random r = new Random(1000);
            System.out.println(r.nextInt(100));
        }

    }
}
