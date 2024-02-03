package Chapter21;

import java.util.*;

public class Ex21_07 {
    public static void main(String[] args) {

        String str = "Good morning." +
                "Have a good class." +
                "Have a good visit." +
                "Have fun!";

        List<String> words = new ArrayList<>(Arrays.stream(str.toLowerCase().split("[ \n\t\r.,;:!(){}]")).toList());

        System.out.println(words);

        ArrayList<WordOccurrence> list = new ArrayList<>();

        for (String e : words) {
            if (listHasWord(list, e)) {

            } else {
                WordOccurrence word = new WordOccurrence(e);
                list.add(word);
            }
        }

        Collections.sort(list);
        //Collections.sort(list, Comparator.comparing(WordOccurrence::getCount).thenComparing(WordOccurrence::getWord));

        list.forEach(System.out::println);
    }

    public static boolean listHasWord(ArrayList<WordOccurrence> list, String s) {

        for (WordOccurrence e : list) {
            if (e.word.equals(s)) {
                e.count++;
                return true;
            }
        }
        return false;

    }
}
