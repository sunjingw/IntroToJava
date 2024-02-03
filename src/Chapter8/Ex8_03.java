package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8_03 {
    public static void main(String[] args) {

        //Sort students on grades
        Scanner input = new Scanner(System.in);

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

         // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] students = new int[answers.length][2];


        for (int i = 0; i < answers.length; i++) {
            int correct = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correct++;
            }
            students[i][0] = i;
            students[i][1] = correct;
        }

        System.out.println(Arrays.deepToString(students));

        sortStudents(students);

    }

    public static void sortStudents(int[][] students) {

        int[][] temp = new int[1][1];

        for (int row = 0; row < students.length; row++) {
            temp[0][1] = students[row][1];
            temp[1][0] = students[row][0];
            int index = students[row][0];

            for (int col = 1; col < students[row].length; col++) {

                if (students[row][1] < temp[row][1]) {
                    temp[0][0] = students[row][0];
                    temp[0][1] = students[row][1];

                    index = students[row][0];
                }

            }

            if (index != row) {

                students[row][0] = students[row][1];


            }
        }

        System.out.println(Arrays.deepToString(students));
    }


    public static void sortByColumn(int[][] students) {

        int[][] temp = new int[1][2];

        for (int col = 1; col < students[0].length; col++) {

            temp[0][1] = students[0][1];
            temp[0][0] = students[0][0];
            int index = students[0][0];

            for (int row = 0; row < students.length; row++) {

                if (students[row][1] < temp[row][1]) {
                    temp[row][1] = students[row][col];
                    temp[row][0] = students[row][0];

                }
            }

        }
    }

}
