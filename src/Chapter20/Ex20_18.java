package Chapter20;

import java.io.File;
import java.util.*;

public class Ex20_18 {
    public static void main(String[] args) {

        File dir = new File(new Scanner(System.in).nextLine());

        System.out.println(getSize(dir));
    }


    private static long getSize(File dir) {
        Queue<File> queue = new PriorityQueue<>();

        long size = 0;

        if (dir.isDirectory()) {
             queue.offer(dir);
        }

        while (!queue.isEmpty()) {
            File t = queue.poll();

            if (t.isFile()) {
                size += t.length();
            } else {

                for (File e : t.listFiles()) {
                    queue.offer(e);
                }
            }
        }
        return size;
    }
}
