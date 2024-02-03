package Chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex21_09 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        try (Scanner in = new Scanner(new File("./src/Chapter21/capitals.txt"))) {

            while (in.hasNextLine()) {
                String[] s = in.nextLine().split(" ");

                map.put(s[0], s[1]);

            }
        }

        boolean gameInSession = true;


        while (gameInSession) {

            String state = input.nextLine();

            System.out.println("The capital is " + map.get(state));

        }

//        for (Map.Entry<String, String> e : map.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
//        }
    }
}
