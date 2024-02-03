package Chapter7;

import java.util.Scanner;

public class Ex7_35 {
    public static void main(String[] args) {

        //Game - hangman
        Scanner input = new Scanner(System.in);
        playGame();

        String s = "";

        do {
            System.out.println("Do you want to guess another word? Enter y or n");
            s = input.nextLine();

            if (s.equals("y"))
                playGame();
            else
                s = "n";

        } while (s.equals("y"));
    }

    public static void playGame() {
        Scanner input = new Scanner(System.in);
        String[] words = {"test", "fun", "ace", "baba"};

        char[] word = generateWord(words);
        char[] hiddenWord = generateHiddenWord(word);
        boolean repeat = true;
        int missed = 0;

        do {
            System.out.print("Enter a letter in words " + printWord(hiddenWord) + " > ");
            char c = input.next().charAt(0);
            //System.out.println();

            //if the guessing letter exists in the word
            if (compareAgainstOriginalWord(word, c)) {

                //compare vs the hidden word
                if (compareAgainstHiddenWord(hiddenWord, c)) {

                    //add letter to the char array word
                    addLetterToWord(word, hiddenWord, c);

                } else {
                    System.out.println(c + " is already in the word");
                }

            } else {
                System.out.println(c + " is not in the word");
                missed++;
                //repeat the guess prompt
            }

            //check if the hiddenWord matches the original word
            repeat = !compareArray(word, hiddenWord);

        } while (repeat);
        System.out.println("The word is " + printWord(word) + ". You missed " + missed + ((missed > 1) ?  " times" :  " time"));

    }
    public static char[] generateWord(String[] words) {
        //randomly generate an index integer to pick a word from string of words
        int random = (int)(Math.random() * words.length);

        //create a char array to hold the same size as the chosen word
        char[] word = new char[words[random].length()];

        //obfuscate the array with *
        for (int i = 0; i < word.length; i++) {
            word[i] = words[random].charAt(i);
        }
        return word;
    }

    public static char[] generateHiddenWord(char[] word) {

        char[] hiddenWord = new char[word.length];

        for (int i = 0; i < word.length; i++) {
            hiddenWord[i] = '*';
        }
        return hiddenWord;
    }

    public static boolean compareAgainstOriginalWord(char[] word, char c) {

         for (int i = 0; i < word.length; i++) {
             if (word[i] == c) {
                 return true;
             }
         }
         return false;
    }

    public static boolean compareAgainstHiddenWord(char[] word, char c) {

        for (int i = 0; i < word.length; i++) {

            if (word[i] == c) {
                return false;
            }
        }
        return true;
    }

    public static void addLetterToWord(char[] word, char[] hiddenWord, char c) {

        for (int i = 0; i < word.length; i++) {

            if (word[i] == c) {
                hiddenWord[i] = c;
            }
        }
    }

    public static boolean compareArray(char[] word, char[] hiddenWord) {

        for (int i = 0; i < word.length; i++) {
            if (word[i] != hiddenWord[i])
                return false;
        }

        return true;
    }

    public static String printWord(char[] word) {
        //method used to print char array into string
        String s = "";

        for (char e : word) {
            s += e;
        }

        return s;
    }
}
