package Chapter10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = "ab#12#453";
        String regex = "#";

        String[] str = split(s, regex);
        System.out.println(Arrays.toString(str));

        str = split("a?b?gf#e", "[?#]");
        System.out.println(Arrays.toString(str));
    }

    public static String[] split (String s, String regex) {

        String[] reg = new String[regex.length()];
        String[] str = new String[s.length()];

        for (int i = 0; i < regex.length(); i++) {
            if (regex.charAt(i) != '[' || regex.charAt(i) != ']')
                reg[i] = regex.charAt(i) + "";
        }

        int index = 0;
        boolean found = false;
        int begin = 0;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < reg.length; j++) {

                if ((s.charAt(i) + "").equals(reg[j])) {
                    str[index] = s.substring(begin, i);
                    index++;
                    begin = i;
                    found = true;
                }
            }

            if (found) {
                str[index] = s.substring(begin, begin + 1);
                index++;
                begin = begin + 1;
                found = false;

            } else if (i == str.length - 1) {
                str[index++] = s.substring(begin, s.length());
            }
        }

        String[] strArr = new String[index];
        System.arraycopy(str, 0,strArr,0, index); //clean up the array by getting rid of null elements

        return strArr;
    }

}
