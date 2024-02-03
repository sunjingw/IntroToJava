package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_10 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine(); //174.0

        int numberOfPieces = input.nextInt();

        File file = new File("./src/" + fileName);

        System.out.println("file isze = " + file.length());
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
            long eachFileSize = file.length() / numberOfPieces;

            System.out.println("each file size = " + eachFileSize);

            for (int i = 0; i < numberOfPieces; i++) {
                try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file + "." + i))) {

                    int value, bytesCopied = 0;
                    while (bytesCopied < eachFileSize && (value = in.read()) != -1) {
                        output.write((byte)value);
                        bytesCopied++;
                    }
                }
            }

        }
    }
}