package Chapter21;

import java.util.*;

public class Ex21_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Set<Integer> answers = new HashSet<>();

        //generate 2 random integers
        int num1 = new Random().nextInt(10);
        int num2 = new Random().nextInt(10);

        //addition and add answer to set
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = input.nextInt();

        while (num1+num2 != answer) {
            if (answers.contains(answer)) {
                System.out.println("You already entered " + answer);
            } else {
                if (num1 + num2 == answer) {
                    System.out.println("You got it!");
                    break;
                } else {
                    System.out.println("Wrong answer. Try again. What is " + num1 + " + " + num2 + "? ");
                    answers.add(answer);
                }
            }
            answer = input.nextInt();
        }
    }
}
