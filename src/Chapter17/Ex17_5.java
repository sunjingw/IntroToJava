package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_5 {
    public static void main(String[] args) throws FileNotFoundException {

        Date date = new Date();
        int[] arr = {1, 2, 3, 4, 5};
        double d = 5.5;

        File file = new File("./src/Ex17_5.dat");

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {

            output.writeObject(date);
            output.writeObject(arr);
            output.writeDouble(d);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
