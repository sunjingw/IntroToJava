package Chapter4;

import java.util.Scanner;

public class Ex4_25 {
    public static void main(String[] args) {

        //Generate vehicle plate numbers
        Scanner input = new Scanner(System.in);

        //Generate three uppercase letters
        int rand1 = (int)(Math.random() * 26 + 65);
        int rand2 = (int)(Math.random() * 26 + 65);
        int rand3 = (int)(Math.random() * 26 + 65);


        //Generate four digits 0000 - 9999
        int num = (int)(Math.random() * 10000);

        String num1 = "";
        String c = Character.toString(rand1) + Character.toString(rand2) + Character.toString(rand3);

        if (num < 1000 && num > 99) {
            num1 = "0" + num;
        } else if (num < 100) {
            num1 = "00" + num;
        } else {
            num1 = num + "";
        }
        System.out.println(c + num1);

    }
}
