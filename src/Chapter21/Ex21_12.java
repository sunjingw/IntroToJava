package Chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex21_12 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        //input filename

        String fileName = input.nextLine();

        File file = new File("./src/Chapter21/baby/" + fileName);

        Set<String> boyNames = new HashSet<>();
        Set<String> girlNames = new HashSet<>();
        Set<String> dupeNames = new HashSet<>();

        //find common name in both gender
        try (Scanner in = new Scanner(file)) {
            while (in.hasNextLine()) {
                String[] line = in.nextLine().trim().split("\\s+");
                System.out.println(Arrays.toString(line));
                String boy = line[1];
                String girl = line[3];

                if (boyNames.contains(girl)) {
                    dupeNames.add(girl);
                } else if (!boyNames.contains(boy)) {
                    boyNames.add(boy);
                }

                if (girlNames.contains(boy)) {
                    dupeNames.add(boy);
                } else if (!girlNames.contains(girl)) {
                    girlNames.add(girl);
                }
            }
        }
        System.out.println(dupeNames.size() + " names used for both genders");

        for (String e : dupeNames) {
            System.out.print(e + " ");
        }
            //use two sets
    }
}
