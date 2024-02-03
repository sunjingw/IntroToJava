package Chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex21_13 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        Set<List<Map<String, Integer>>> boys = new HashSet<>();
        Set<List<Map<String, Integer>>> girls = new HashSet<>();

        readFile(boys, girls);

        while (true) {

                System.out.print("Enter the year: ");
                int year = input.nextInt();

                input.nextLine();

                System.out.print("Enter the gender: ");
                String gender = input.nextLine();

                System.out.print("Enter the name: ");
                String name = input.nextLine();

                search(year, gender, name, boys, girls);


            System.out.print("Enter another inquiry Y/N? ");

            String s = input.nextLine();

            if (s.equals("N")) {
                break;
            }
        }
    }

    public static void search(int year, String gender, String name, Set<List<Map<String, Integer>>> boys, Set<List<Map<String, Integer>>> girls) {

        if (gender.equals("M")) {
            boys.forEach(e -> {
               if (e.get(year - 2001).containsKey(name)) {
                   System.out.println("Boy name " + name + " is ranked #" + e.get(year-2001).get(name) + " in year " + year);
               }

            });
        } else {
            girls.forEach(e -> {
                if (e.get(year - 2001).containsKey(name)) {
                    System.out.println("Girl name " + name + " is ranked #" + e.get(year-2001).get(name) + " in year " + year);
                }
            });
        }
    }

    public static void readFile(Set<List<Map<String, Integer>>> boys, Set<List<Map<String, Integer>>> girls) throws FileNotFoundException {


    List<Map<String, Integer>> boyYear = new ArrayList<>();
    List<Map<String, Integer>> girlYear = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
        String path = "./src/Chapter21/baby/babynamesranking" + (2000+i) + ".txt";
        File file = new File(path);

        Map<String, Integer> boyNames = new LinkedHashMap<>();
        Map<String, Integer> girlNames = new LinkedHashMap<>();

        try (Scanner input = new Scanner(file)) {

            while (input.hasNextLine()) {
                String[] line = input.nextLine().trim().split("\\s+");
                int rank = Integer.parseInt(line[0]);

                boyNames.put(line[1], rank);
                girlNames.put(line[3], rank);
            }
        }

        boyYear.add(boyNames);
        girlYear.add(girlNames);
    }

        boys.add(boyYear);
        girls.add(girlYear);

}
}
