package Chapter20;


import java.io.*;
import java.util.*;

public class Ex20_01  {
    public static void main(String[] args) throws FileNotFoundException {

        Collection<String> list = new LinkedList<>();

        //read words from a text file
        File file = new File("./src/Chapter20/Ex20_01.txt");

        try(Scanner input = new Scanner(file)) {

            while(input.hasNext()) {
                list.add(input.next());
            }
        }

        //display words in ascending alphabetical order
        Collections.sort((LinkedList<String>)list);

        System.out.println(list);


    }


}
