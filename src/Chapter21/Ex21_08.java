package Chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Ex21_08 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File file = new File("./src/Chapter21/words.txt");
        List<String> list = new ArrayList<>();

//        try(Scanner in = new Scanner(file)) {
//            while (in.hasNext()) {
//                list.add(in.nextLine());
//            }
//        }
//
//        Collections.shuffle(list);
//        Collections.shuffle(list);
//
//        try(PrintWriter output = new PrintWriter(file)) {
//            for (String e : list) {
//                output.println(e.trim().toString().replace("[", "").replace("]", "").replace(",", "\n"));
//            }
//        }

        Map<String, Integer> map = new TreeMap<>();
        try (Scanner in = new Scanner(file)) {

            while (in.hasNext()) {

                String word = in.next();
                if (!map.containsKey((word))) {
                    map.put(word, 1);
                } else {
                    int value = map.get(word);
                    map.put(word, ++value);
                }
            }
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getValue() + "   " + e.getKey());
        }

    }
}
