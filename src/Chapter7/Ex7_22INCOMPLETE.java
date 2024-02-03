package Chapter7;

import java.util.Scanner;

public class Ex7_22INCOMPLETE {
    public static void main(String[] args) {

        //Game - Eight Queens
        Scanner input = new Scanner(System.in);

        int[] board = new int[64];

        int queen = 0;
        
        placeQueen(board, 0, 3);

        placeQueen(board, 1, 0);

        printBoard(board);

        
    }
    
    public static void placeQueen(int[] board, int row, int queen) {

        //queen = 0;
        //queen = 4;

        for (int i = row; i < board.length / 8; i++) {

            for (int j = i * 8; j < i * 8 + 8; j++) {

                if (i == row)
                board[j] = 1;
                    //board[i * 8 + j] = 1;
                    //board[queen + i * 8] = 6;


                if (i >= row && i < 8) {
                    //from i = 1 to 7 pass the row into a method to check for available square

                    if (j == queen + 8 * i)
                        board[queen + 8 * i] = 1;
                    else if (j == queen + 8 * i - i)
                        board[queen + 8 * i - i] = 1;
                    else if (j == queen + 8 * i + i)
                        board[queen + 8 * i + i] = 1;
                    //chess[j] = 1;
                }

                //System.out.print(board[j] + " ");
            }

            //System.out.println();
        }
        
    }

    public static void printBoard(int[] board) {

        for (int i = 0; i < board.length / 8; i++) {

            for (int j = i * 8; j < i * 8 + 8; j++) {

                System.out.print(board[j] + " ");
            }

            System.out.println();
        }
    }
}
