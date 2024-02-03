package Chapter20;

import java.io.File;
import java.util.*;

public class Ex20_20 {
    public static void main(String[] args) {

        System.out.println(getSize(new File(new Scanner(System.in).nextLine())));

    }

    public static long getSize(File dir) {
        Stack<File> stack = new Stack<>();
        long size = 0;

        if (dir.isDirectory()) {
            stack.push(dir);
        }

        while (!stack.isEmpty()) {
            File t = stack.pop();

            if (t.isFile()) {
                size += t.length();
            } else {

                for (File e : t.listFiles()) {
                    stack.push(e);
                }
            }
        }
        return size;
    }
}
