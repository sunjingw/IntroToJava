package Chapter20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex20_03 {
    public static void main(String[] args) throws FileNotFoundException {

        playGame();

    }

    private static ArrayList<String> getList(File file) throws FileNotFoundException {
        //File file = new File("\"" + s + "\"");
        ArrayList<String> list = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                list.add(input.nextLine());
            }
        }
        return list;
    }

    private static void playGame() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();
        File q = new File("./src/Chapter20/states.txt");
        File a = new File("./src/Chapter20/capitals.txt");

        questions = getList(q);
        answers = getList(a);

        Collections.shuffle(questions, new Random(50));
        Collections.shuffle(answers, new Random(50));

        int question = 0;
        int correct = 0;
        while (question < 50) {

            System.out.print("What is the capital of " + questions.get(question) + "? ");
            String answer = input.next();

            if (answer.equalsIgnoreCase(answers.get(question))) {
                System.out.print("Your answer is correct\n");
                correct++;
            } else {
                System.out.print("The correct answer should be " + answers.get(question) + "\n");
            }

            question++;

        }

        System.out.println("The correct count is " + correct);
    }
}
