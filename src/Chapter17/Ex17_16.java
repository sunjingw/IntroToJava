package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_16 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName = input.nextLine();

        File file = new File("./src/" + fileName);

        int upperCount = 0;
        int lowerCount = 0;

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {


            int value;
            while ((value = in.read()) != -1) {
                if (value >= 97 && value <= 122) {
                    lowerCount++;
                } else if (value >= 65 && value <= 90) {
                    upperCount++;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Lower case letters: " + lowerCount);
        System.out.println("Uppercase letters: " + upperCount);
    }
}
