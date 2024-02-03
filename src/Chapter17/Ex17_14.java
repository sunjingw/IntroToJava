package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_14 {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName = input.nextLine();

        System.out.println("Enter output file name: ");
        String outputFileName = input.nextLine();

        File file = new File("./src/" + fileName);

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("./src/" + outputFileName))) {

            int value;
            //byte[] buf = new byte[1024];
            while ((value = in.read()) != -1) {
                output.write((byte) (value + 5));

            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
