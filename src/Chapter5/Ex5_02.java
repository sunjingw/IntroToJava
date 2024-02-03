package Chapter5;

import java.util.Scanner;

public class Ex5_02 {
    public static void main(String[] args) {

        //Repeat additions
        Scanner input = new Scanner(System.in);

        long start = System.currentTimeMillis();
        int correct = 0;

        //Generate ten random addition questions for two integers between 1 - 15
        for (int i = 0; i < 10; i++) {
            int temp;
            int num1 = (int)(Math.random() * 15 + 1);
            int num2 = (int)(Math.random() * 15 + 1);

            //Swap num1 and num2 if num1 is less than num2
            if (num1 < num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            System.out.println("What is " + num1 + " - " + num2 + " ?");

            int answer = input.nextInt();

            //Increment correct count
            if (num1 - num2 == answer) {
                correct++;
            } else
                continue;

        }

        System.out.println("The number of correct answers is " + correct);
        System.out.println("The time it took was " + (System.currentTimeMillis() - start) / 1000 + " seconds");

    }
}
