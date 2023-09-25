package Chapter4;

import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {

        //Student major and status
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two characters: ");
        String s = input.nextLine();

        char major = s.charAt(0);
        char status = s.charAt(1);

        if (major == 'M') {
            s = "Mathematics";
        } else if (major == 'C') {
            s = "Computer Science";
        } else if (major == 'I') {
            s = "Information Technology";
        } else {
            s = "Invalid Input";
            System.out.println(s);
            System.exit(1);
        }

         if (status == '1') {
             s += " Freshman";
         } else if (status == '2') {
             s += " Sophmore";
         } else if (status == '3') {
             s += " Junior";
         } else if (status == '4') {
             s += " Senior";
         }

        System.out.println(s);
    }
}
