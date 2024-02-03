package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_2 {
    public static void main(String[] args) throws IOException {

        File file = new File("17_2.dat");

        if (file.exists()) {
            try (
                    FileOutputStream output = new FileOutputStream(file, true);
            ){
                for (int i = 65; i < 86; i++) {
                    output.write(i);
                }
            }
        } else {
             try (FileOutputStream output = new FileOutputStream(file, false)) {
                 for (int i = 97; i < 122; i++) {
                     output.write(i);
                 }
             }
        }

        System.out.println("Read with Scanner - text reader");
        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {
                System.out.print(input.next());
            }
        }

        System.out.println();
        System.out.println("Read with FileInputStream - binary reader");
        try (FileInputStream input = new FileInputStream(file)) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }
    }
}
