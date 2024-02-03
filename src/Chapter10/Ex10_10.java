package Chapter10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Queue q = new Queue();

        for (int i = 1; i <= 20; i++) {
            q.enqueue(i);

        }

        System.out.println(q.toString());

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.toString());
        System.out.println(q.getSize());
    }

}
