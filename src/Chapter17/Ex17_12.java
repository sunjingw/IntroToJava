package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_12 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        //combine smaller files into a new file

        //request file names
        String fileName = input.nextLine();
        String[] files = fileName.split(" ");

        readAndWrite(files);

    }
    public static void readAndWrite (String[] files) {


        try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("./src/" + files[files.length-1], true))) {

            for (int i = 0; i < files.length - 1; i++) {

                File file = new File("./src/" + files[i]);

                try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {

                    int value;
                    //byte[] buf = new byte[8196];
                    while ((value = in.read()) != -1) {

                        output.write(value);

                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
