package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_1 {
    public static void main(String[] args) throws IOException {

        File file = new File("17_1.txt");

        if (file.exists()) {
            try (
                    PrintWriter output = new PrintWriter(new FileOutputStream(file, true));
            ) {
                for (int i = 55; i <= 77; i += 5) {
                    output.append(i + " \n");
                }
            }
        } else {

            try (
                    PrintWriter output = new PrintWriter(new FileOutputStream(file, false));
            ) {
                for (int i = 0; i <= 100; i++) {
                    output.print(i + " ");
                }
            }
        }
    }
}
