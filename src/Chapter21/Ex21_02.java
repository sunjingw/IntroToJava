package Chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex21_02 {
    public static void main(String[] args) throws FileNotFoundException {

        Set<String> list = new TreeSet<>();

        try (Scanner input = new Scanner(new File("./src/Chapter21/words.txt"))) {

            while (input.hasNext()) {
                list.add(input.nextLine());
            }
        }

        list.forEach(System.out::println);
    }
}
