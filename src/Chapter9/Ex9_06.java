package Chapter9;

import java.util.Scanner;

public class Ex9_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StopWatch watch = new StopWatch();

        int[] list = new int[100000];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 100000);
        }

        watch.start();
        selectionSort(list);
        watch.stop();
        System.out.println(watch.getElapsedTime() + "ms");
    }

    public static void selectionSort(int[] list) {

        for (int i = 0; i < list.length; i++) {

            int min = list[i];
            int index = i;

            for (int j = i; j < list.length; j++) {

                if (list[j] < min) {
                    min = list[j];
                    index = j;
                }
            }

            if (index != i) {
                list[index] = list[i];
                list[i] = min;
            }
        }

    }
}
