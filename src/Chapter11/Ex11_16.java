package Chapter11;

import java.util.*;

public class Ex11_16 {
    public static void main(String[] args) {

        //Addition quiz
        Scanner input = new Scanner(System.in);

        generateQuestion();

    }

    public static void generateQuestion() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answerList = new ArrayList<>();

        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);

        while (true) {
            System.out.print("What is " + random1 + " + " + random2 + "?");
            int answer = input.nextInt();

            if (answer == (random1 + random2)) {
                System.out.println("You got it!");
                break;
            } else {
                if (answerList.contains(answer))
                    System.out.println("You already entered " + answer);

                System.out.println("Wrong answer. Try again. ");
            }
            answerList.add(answer);
        }
    }
}
