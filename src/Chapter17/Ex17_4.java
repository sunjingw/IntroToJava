package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_4 {
    public static void main(String[] args) throws IOException {

        File file = new File("./src/Ex17_4.java");
        File utf = new File("./src/Ex17_4.utf");

        String line = "";

        try (Scanner input = new Scanner(file)) {


                try (DataOutputStream output = new DataOutputStream(new FileOutputStream(utf))) {

                while (input.hasNext()) {
                    //System.out.print(value);
                    //line += input.next();
                    output.writeUTF(input.next());
                    //output.writeBytes(input.nextLine());

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("text file size = " + file.length());
        System.out.println("binary file size = " + utf.length());

        //System.out.println(line);

        //try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {

            //output.writeUTF(line);
        //}
    }
}
