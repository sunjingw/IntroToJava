package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "dataset_91007.txt";

        File file = new File(path);

        int max = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {

                int n = input.nextInt();
                if (n > max)
                    max = n;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
        }

        System.out.println(max);
    }
}
