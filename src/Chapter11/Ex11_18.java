package Chapter11;

import java.lang.reflect.Array;
import java.util.*;

public class Ex11_18 {
    public static void main(String[] args) {

        //ArrayList of Character
        Scanner input = new Scanner(System.in);

        ArrayList<Character> ch = toCharacterArray("abc");

        System.out.println(ch);
    }

    public static ArrayList<Character> toCharacterArray(String s) {

        ArrayList<Character> ch = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            ch.add(s.charAt(i));
        }

        return ch;
    }
}
