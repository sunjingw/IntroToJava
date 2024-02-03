package Chapter6;

import java.util.Scanner;

public class Ex6_23 {
    public static void main(String[] args) {

        //Occurrences of a specified character
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Find the number of occurrence for a particular letter: ");
        char c = input.nextLine().charAt(0);

        System.out.println(count(s, c));
    }

    public static int count(String str, char a) {

          int count = 0;

          for (int i = 0; i < str.length(); i++) {
              if (str.charAt(i) == a) {
                  count++;
              }
          }

          return count;
    }
}
