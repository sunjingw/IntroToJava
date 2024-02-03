package Chapter5;

import java.util.Scanner;

public class Ex5_51 {
    public static void main(String[] args) {

        //Longest common prefix
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();

        System.out.println("Enter the second string: ");
        String s2 = input.nextLine();

        int endIndex = 0;

        boolean isPrefix = false;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                endIndex = i;
                break;
            }
        }

        if (endIndex > 0) {
            System.out.println("The common prefix is " + s1.substring(0, endIndex));
        } else {
            System.out.println(s1 + " and " + s2 + " have no common prefix");
        }
    }
}
