package Chapter7;

import java.util.Scanner;

public class Ex7_04 {
    public static void main(String[] args) {

        //Analyze scores
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a list of scores: ");
        int score = 0;

        int[] scores = new int[100];
        int index = 0;
        double avg = 0;

        while (score >= 0) {

            score = input.nextInt();

            if (score > 0) {
                avg += score;
                scores[index] = score;
                index++;
            } else
                continue;

        }

        avg = avg / index;

        checkScore(scores, avg);


    }

    public static void checkScore(int[] score, double avg) {

        int countAbove = 0;
        int countSame = 0;
        int countBelow = 0;

        for (int i = 0; i < score.length; i++) {

            if (score[i] != 0 && score[i] > avg) {
                countAbove++;
            } else if (score[i] != 0 && score[i] == avg) {
                countSame++;
            } else if (score[i] != 0 && score[i] < avg) {
                countBelow++;
            }
        }

        System.out.println("Above average: " + countAbove);
        System.out.println("Exact match: " + countSame);
        System.out.println("Below average: " + countBelow);
    }
}
