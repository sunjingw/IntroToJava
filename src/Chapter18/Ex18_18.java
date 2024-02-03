package Chapter18;

import java.util.*;

public class Ex18_18 {
    static int count;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        moveDisk(n, 'A', 'B', 'C');

        System.out.println(count);

    }

    public static void moveDisk(int n, char from, char to, char aux) {

        count++;

        if (n == 1) {
            System.out.println("Disk " + n + " from " + from + " to " + to);
        } else {
            moveDisk(n - 1, from, aux, to);
            System.out.println("Disk " + n + " from " + from + " to " + to);
            moveDisk(n - 1, aux, to ,from);
        }

    }
}
