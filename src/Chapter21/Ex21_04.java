package Chapter21;

import java.io.*;
import java.util.*;

public class Ex21_04 {
    public static void main(String[] args) throws IOException {

        Set<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));
        Set<String> consonants = new HashSet<>(Arrays.asList("b", "c", "d", "f", "g", "h"
                , "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"));

        Scanner input = new Scanner(System.in);

        String url = input.nextLine();

        File file = new File(url);

        int countVowels = 0;
        int countConsonants = 0;

        try (Scanner in = new Scanner(file)) {

            while (in.hasNext()) {
                String s = in.next().toLowerCase();

                for (char c : s.toCharArray()) {
                    if (vowels.contains(c + ""))
                        countVowels++;
                    else if (consonants.contains(c + ""))
                        countConsonants++;
                }
            }
        }

        System.out.println("vowels = " + countVowels);
        System.out.println("consonants = " + countConsonants);

    }
}
