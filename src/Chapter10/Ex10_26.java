package Chapter10;

import java.util.Scanner;

public class Ex10_26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a math equation: ");
        String s = input.nextLine();

        System.out.println(solve(s));
    }

    public static int solve(String s) {

        int answer = 0;

        s = s.replace(" ", "");

        String[] str = new String[s.length()];

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                index = i;
            }
        }

        if (s.charAt(index) == '+') {
             answer = Integer.parseInt(s.substring(0, index)) + Integer.parseInt(s.substring(index + 1, s.length()));
        } else if (s.charAt(index) == '-') {
            answer = Integer.parseInt(s.substring(0, index)) - Integer.parseInt(s.substring(index + 1, s.length()));
        } else if (s.charAt(index) == '*') {
            answer = Integer.parseInt(s.substring(0, index)) * Integer.parseInt(s.substring(index + 1, s.length()));
        } else
            answer = Integer.parseInt(s.substring(0, index)) / Integer.parseInt(s.substring(index + 1, s.length()));

        return answer;
    }
}
