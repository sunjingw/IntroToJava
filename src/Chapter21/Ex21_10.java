package Chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex21_10 {
    static boolean comment = false;
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("./src/Chapter21/Test.java");

        Map<String, Integer> map = new LinkedHashMap<>();
        Set<String> comments = new HashSet<>(Set.of("/**", "/*", "*/", "\""));

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String[] str = input.nextLine().trim().splitWithDelimiters("[ \"().]", 0);

                for (String key : str) {

                    //ignore whitespace
                    if (key.equals("") || key.equals(" "))
                        continue;

                    //ignore comment or in string literal
                    if (key.equals("//")) {
                        break;

                    } else if (comments.contains(key)) {

                        comment = !comment;

                    } else if (!comment) {
                        //count word occurrence
                        if (!map.containsKey(key)) {
                            map.put(key, 1);
                        } else {
                            int value = map.get(key);
                            map.put(key, ++value);
                        }
                    }
                }
            }


            for (Map.Entry<String, Integer> e : map.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
