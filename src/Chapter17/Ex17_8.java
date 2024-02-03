package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_8 {
    static int count;
    public static void main(String[] args) throws IOException {

        File file = new File("./src/Ex17_8.dat");

        try (DataInputStream input = new DataInputStream(new FileInputStream(file))) {


            if ((count = input.readInt()) != -1) {
                count++;
            }

            try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {

                if (count == 0)
                    output.writeInt(0);
                else {
                    output.writeInt(count);
                    System.out.println("Wrote to file: " + count);
                }
            }

        } catch (EOFException e) {
            System.out.println(e);
        }


    }
}
