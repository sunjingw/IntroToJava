package Chapter4;

import java.util.Scanner;

public class Ex4_21 {
    public static void main(String[] args) {

        //Check SSN
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SSN in the format DDD-DD-DDDD: ");
        String ssn = input.nextLine();

        if ((ssn.charAt(3) == '-' && ssn.charAt(6) == '-')) {
            System.out.println(ssn + " is a valid social security number");

        } else {
            System.out.println(ssn + " is not a valid social security number");
        }
    }
}
