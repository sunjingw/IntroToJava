package Chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class ReadData {
    public static void main(String[] args) throws Exception {

//        Scanner input = new Scanner(System.in);

        File file = new File("data.txt");

        try (FileInputStream input = new FileInputStream(file)) {
            int content;
            while ((content = input.read()) != -1) {
                System.out.print((char)content);
            }
        }
    }
}
