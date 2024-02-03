package Chapter7;

import java.util.Scanner;

public class Ex7_01 {
    public static void main(String[] args) {

        //Assign grades
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        System.out.println("Enter " + numOfStudents + " scores: ");
        int[] scores = new int[numOfStudents];

        int highest = 0;

        for (int i = 0; i < numOfStudents; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > highest)
                highest = scores[i];
        }

        printGrade(scores, highest);

    }

    public static void printGrade(int[] score, int highest) {

        for (int i = 0; i < score.length; i++) {

            if (score[i] >= highest - 10) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is A");
            } else if (score[i] >= highest - 20) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is B");
            } else if (score[i] >= highest - 30) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is C");
            } else if (score[i] >= highest - 40) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is D");
            }
        }


    }
}
