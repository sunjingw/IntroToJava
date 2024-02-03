package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_3 {
    public static void main(String[] args) throws IOException {

        File file = new File("Ex17_03.dat");
        Scanner input = new Scanner(System.in);

        int total = 0;

        try {
            try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {

                int num = -1;
                while (num != 0) {
                    num = input.nextInt();
                    output.writeInt(num);
                }
            }

            try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {

                int num = 0;

                while(true) {
                    total += in.readInt();
                }

            }
        } catch (EOFException e) {
            System.out.println(total);
        }

    }
}
