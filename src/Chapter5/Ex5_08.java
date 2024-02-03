package Chapter5;

import java.util.Scanner;

public class Ex5_08 {
    public static void main(String[] args) {

        //Find the highest score
        Scanner input = new Scanner(System.in);

        //Prompt  the user to enter # of students and each student name and score
        System.out.println("Enter number of students");
        int num = input.nextInt();
        int highest = 0;
        String highestName = "";

        for (int i = 0; i < num; i++) {
            input.nextLine();
            System.out.println("Enter student's name: ");
            String name = input.nextLine();

            System.out.println("Enter student's score: ");
            int score = input.nextInt();

            if (score > highest) {
                highest = score;
                highestName = name;
            }
        }
        //Find person with highest score
        System.out.println("The person with highest score is " + highestName + " with score " + highest);
    }
}
