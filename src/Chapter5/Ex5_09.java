package Chapter5;

import java.util.Scanner;

public class Ex5_09 {
    public static void main(String[] args) {

        //Find the two highest score
        Scanner input = new Scanner(System.in);

        //Prompt number of students
        System.out.println("Enter number of students: ");
        int num = input.nextInt();

        //Enter student name and score
        int highest = 0;
        int temp = 0;
        String highestName = "";
        String tempName = "";
        String name = "";
        int score;

        for (int i = 0; i < num; i++) {
            input.nextLine();
            System.out.println("Enter name of student: ");
            name = input.nextLine();

            System.out.println("Enter score of student: ");
            score = input.nextInt();

            if (score > highest) {
                temp = highest;
                tempName = highestName;
                highest = score;
                highestName = name;
            } else if (score < highest && score > temp) {
                temp = score;
                tempName = name;
            }

        }
        //Display the student with highest score and second highest score
        System.out.println("The student with highest score is " + highestName + " with score of " + highest);
        System.out.println("The student with second highest score is " + tempName + " with score of " + temp);
    }
}
