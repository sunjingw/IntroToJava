package Chapter7;

import java.util.Scanner;

public class Ex7_17 {
    public static void main(String[] args) {

        //Sort students
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int num = input.nextInt();

        input.nextLine();

        String[] students = new String[num];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter student's name and score: ");

            students[i] = input.nextLine();

        }

        String temp = "";

        for (int i = 0; i < students.length; i++) {

            int max = Integer.parseInt(students[i].substring(students[i].length()-3, students[i].length()).trim());
            int index = i;

            for (int j = i; j < students.length; j++) {
                int score = Integer.parseInt(students[j].substring(students[j].length()-3, students[j].length()).trim());
                if (score > max) {
                    index = j;
                }
            }

            if (index != i) {
                temp = students[i];
                students[i] = students[index];
                students[index] = temp;
            }
        }

        for (String e : students) {
            System.out.println(e);
        }
    }
}
