package Chapter12;

import java.io.*;
public class WriteData {
    public static void main(String[] args) throws IOException {
        // write your code here
        File file = new File("data.txt");

        try (
        PrintWriter output = new PrintWriter(file);
        ) {
            output.println(file.getAbsolutePath());
            output.println(file.exists());
            output.println(file.canExecute());
            output.println(file.canRead());
            output.println(file.canWrite());

            System.out.println(file.getAbsolutePath());
            System.out.println(file.exists());
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());

        }
    }
}
