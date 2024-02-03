package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_15 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter encrypted file name: ");
        String encryptFile = input.nextLine();

        System.out.println("Enter decrypted file name: ");
        String decryptFile = input.nextLine();

        File file = new File("./src/" + encryptFile);

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("./src/" + decryptFile))) {

            int value;
            while ((value = in.read()) != -1) {
                output.write(value - 5);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
