//package Chapter20;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.input.KeyCode;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.paint.Paint;
//import javafx.scene.shape.*;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.*;
//
//public class Ex20_07 extends Application {
//
//    private String word;
//    private List<String> words = new ArrayList<>();
//    private static final int CHANCES = 7;
//
//    private String missed = "Missed letters: ";
//    private String guessed = "Guess a word: ";
//    private StringBuilder missedLetter = new StringBuilder();
//    private StringBuilder guess = new StringBuilder();
//    private int wrong;
//    private int correct;
//    private Pane hangman;
//
//    private Label missedLetters = new Label();
//    private Label guessWord = new Label();
//
//    private Label xy = new Label();
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws FileNotFoundException {
//
//       startGame(primaryStage);
//    }
//
//    private void clear() {
//        missedLetter = new StringBuilder();
//        guess = new StringBuilder();
//        missedLetters.setText("");
//        wrong = 0;
//        correct = 0;
//
//    }
//
//    private void startGame(Stage stage) throws FileNotFoundException {
//
//        initializeWord();
//
//        //Box for guessing word
//        HBox guessWord = new HBox();
//        guessWord.getChildren().add(this.guessWord);
//        guessWord.setAlignment(Pos.CENTER);
//        HBox missedWord = new HBox();
//        missedWord.getChildren().add(missedLetters);
//        missedWord.setAlignment(Pos.CENTER);
//        VBox vbox = new VBox(guessWord, missedWord);
//
//
//        //Draw the Hangman
//        hangman = new Pane();
//        Line line = new Line(165, 30, 55, 30);
//        Line pole = new Line(55, 30, 55, 270);
//        Arc arc = new Arc(55, 300, 45, 30, 0, 180);
//        arc.setFill(null);
//        arc.setType(ArcType.OPEN);
//        arc.setStroke(Color.BLACK);
//        hangman.getChildren().addAll(line, pole, arc);
//
//        //Pane
//        BorderPane pane = new BorderPane();
//        pane.setCenter(hangman);
//        pane.setBottom(vbox);
//        pane.setTop(xy);
//
//
//        Scene scene = new Scene(pane, 360, 380);
//        stage.setTitle("Ex20_07");
//        stage.setScene(scene);
//        stage.show();
//
//        this.guessWord.setFont(new Font(15));
//        this.guessWord.setPrefSize(200, 25);
//        missedLetters.setFont(new Font(15));
//        missedLetters.setPrefSize(200, 25);
//
//
//        //find XY coordinates
//        scene.setOnMouseMoved(e -> {
//            xy.setText(e.getX() + ", " + e.getY());
//        });
//
//        //Keyboard action
//        scene.setOnKeyPressed(e -> {
//
//            System.out.println("e.getcode " + e.getCode());
//            System.out.println(word.contains(e.getText()));
//
//
//            if (word.contains(e.getText())) {
//                correctGuess(e.getText());
//                correct++;
//
//            } else {
//                if (missedLetter.indexOf(e.getText()) < 0) {
//                    missedLetter.append(e.getText());
//
//                    missedLetters.setText(missed + missedLetter);
//
//                    wrong++;
//                    wrongGuess();
//                }
//            }
//
//            if (missedLetter.length() >= CHANCES || word.length() == correct) {
//                this.guessWord.setText("The word is: " + word);
//                missedLetters.setText("To continue the game, press ENTER");
//
//
//                scene.setOnKeyPressed(k -> {
//                    if (k.getCode() == KeyCode.ENTER) {
//                        clear();
//                        try {
//                            start(stage);
//                        } catch (FileNotFoundException ex) {
//                            throw new RuntimeException(ex);
//                        }
//                    }
//                });
//            }
//        });
//    }
//    private void initializeWord() throws FileNotFoundException {
//
//        word = getWord();
//
//        for (int i = 0; i < word.length(); i++) {
//            guess.append("*");
//        }
//        guessWord.setText(guessed + guess);
//
//    }
//
//
//    private void wrongGuess() {
//
//        Line vertical = new Line(165, 30, 165, 60);
//        Circle circle = new Circle(165,90, 30);
//        circle.setFill(null);
//        circle.setStroke(Color.BLACK);
//        Line body = new Line(165, 120, 165, 200);
//        Line leftArm = new Line(165, 145, 115, 195);
//        Line rightArm = new Line(165, 145, 215, 195);
//        Line leftLeg = new Line(165, 200, 115, 250);
//        Line rightLeg = new Line(165, 200, 215, 250);
//
//        //switch case for wrong cases
//        switch(wrong) {
//            case 1: hangman.getChildren().add(vertical);
//                break;
//            case 2: hangman.getChildren().add(circle);
//                break;
//            case 3: hangman.getChildren().add(leftArm);
//                break;
//            case 4: hangman.getChildren().add(rightArm);
//                break;
//            case 5: hangman.getChildren().add(body);
//                break;
//            case 6: hangman.getChildren().add(leftLeg);
//                break;
//            case 7: hangman.getChildren().add(rightLeg);
//                break;
//        }
//    }
//
//    private void correctGuess(String s) {
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == s.charAt(0)) {
//
//                guess.replace(i, i + 1, s);
//
//            }
//        }
//        guessWord.setText(guessed + guess);
//    }
//
//    private String getWord() throws FileNotFoundException {
//        File file = new File("./src/Chapter20/words.txt");
//
//        try (Scanner input = new Scanner(file)) {
//            while (input.hasNext()) {
//                words.add(input.nextLine());
//            }
//        }
//
//        int random = new Random().nextInt((words.size()+1));
//        //int wordLength = ((List<String>)words).get(random).length();
//
//        return words.get(random);
//    }
//
//}
