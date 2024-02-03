package Chapter20;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex20_15 extends Application {
    TextField input = new TextField();
    TextField solution = new TextField();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        startGame(primaryStage);

    }

    private void startGame(Stage stage) throws FileNotFoundException {
        Cards cards = new Cards();

        //HBox for top
        HBox top = new HBox();
        Button find = new Button("Find Solution");
        Button shuffle = new Button("Shuffle");
        top.getChildren().addAll(find, solution, shuffle);
        top.setAlignment(Pos.CENTER_RIGHT);

        //HBox for middle
        HBox middle = new HBox();
        middle.setAlignment(Pos.CENTER);
        //middle.getChildren().addAll((Node) img);

        //HBox for bottom
        HBox bottom = new HBox();
        Label expressionLabel = new Label("Enter an expression: ");
        input.clear();
        Button verify = new Button("Verify");
        bottom.setAlignment(Pos.CENTER);
        bottom.getChildren().addAll(expressionLabel, input, verify);

        //HBox for results
        HBox results = new HBox();
        Label resultLabel = new Label();
        results.getChildren().add(resultLabel);

        VBox vb = new VBox();
        vb.getChildren().addAll(bottom, results);

        //Pane
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.setTop(top);
        pane.setCenter(cards);
        pane.setBottom(vb);


        //Scene
        Scene scene = new Scene(pane, 610, 320);
        stage.setTitle("Ex20_15");
        stage.setScene(scene);
        stage.show();

        //Key actions
        shuffle.setOnAction(e -> {
            try {
                start(stage);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });

        verify.setOnAction(e -> {
            int result = cards.verify(input.getText());
            if (result == 1) {
                resultLabel.setText("Correct");
            } else if (result == -1) {
                resultLabel.setText("Incorrect result");
            } else {
                resultLabel.setText("The numbers in the experssion don't match the numbers in the set");
            }
        });

        find.setOnAction(e -> {

            if (cards.solutionExists()) {

            } else {
                solution.setText("No Solution");
            }
        });

    }

    public class Cards extends Pane {
        private Collection<Integer> cards;
        private Collection<Node> img;

        public Cards() throws FileNotFoundException {

            cards = new ArrayList<>();
            img = new ArrayList<>();

            getCards();

            HBox hbox = new HBox();
            hbox.getChildren().addAll(img);
            hbox.setSpacing(20);
            hbox.setAlignment(Pos.CENTER);
            super.getChildren().add(hbox);

        }

        private boolean solutionExists() {



            return true;
        }

        private void getCards() throws FileNotFoundException {

            for (int i = 1; i <= 4; i++) {

                int random = new Random().nextInt(52);
                cards.add((random % 13) + 1);
                getCard(random + 1);
                System.out.println(random % 13 + 1);

            }
        }

        private void getCard(int random) throws FileNotFoundException {

            Image img = new Image(new FileInputStream("./src/Chapter20/img/" + random + ".png"));
            ImageView v = new ImageView();
            v.setImage(img);
            v.setFitHeight(220);
            v.setFitWidth(120);

            this.img.add(v);

        }

        public int verify(String s) {

            Collection<String> list = new ArrayList<>();
            list.addAll(Arrays.asList((s.split("[-/+*() ]"))));

            Collection<Integer> list2 = new ArrayList<>();
            for (String e : list) {
                if (!e.equals(""))
                    list2.add(Integer.parseInt(e));
            }

            Collections.sort((List<Integer>) list2);
            Collections.sort((List<Integer>) cards);

            System.out.println(list2);
            System.out.println(cards);

            //check input numbers exist in list
            //0 numbers don't match
            if (cards.containsAll(list2)) {
                System.out.println("cards.contains(list)");
            } else {
                return 0;
            }

            //check if expression equals 24
            //1 if correct
            return checkCalculation(input.getText()).equals("24") ? 1 : -1;

        }


        public static String checkCalculation(String expression) {

            Stack<String> operand = new Stack<>();
            Stack<String> operator = new Stack<>();

            StringTokenizer s = new StringTokenizer(expression, "()*/+-", true);

            while (s.hasMoreTokens()) {
                String str = s.nextToken();

                if (str.equals("*") || str.equals("/")) {

                    while (operator.size() > 0 && (operator.peek().equals("*") || operator.peek().equals("/"))) {
                        compute(operand, operator);
                    }

                    operator.push(str);

                } else if (str.equals("+") || str.equals("-")) {
                    while (operator.size() > 0 && (operator.peek().equals("*") || operator.peek().equals("/") ||
                            operator.peek().equals("+") || operator.peek().equals("-"))) {

                        compute(operand, operator);
                    }
                    operator.push(str);

                } else if (str.equals("(")) {
                    operator.add(str);
                } else if (str.equals(")")) {

                    while (!operator.peek().equals("(")) {
                        compute(operand, operator);
                    }
                    operator.pop();
                } else {
                    operand.push(str);
                }
            }

            compute(operand, operator);

            return operand.pop();
        }

        public static void compute(Stack<String> operand, Stack<String> operator) {


            String op = operator.pop();
            int num2 = Integer.parseInt(operand.pop());
            int num1 = Integer.parseInt(operand.pop());

            switch (op) {
                case "-":
                    operand.push((num1 - num2) + "");
                    break;
                case "+":
                    operand.push((num1 + num2) + "");
                    break;
                case "*":
                    operand.push((num1 * num2) + "");
                    break;
                case "/":
                    operand.push((num1 / num2) + "");
                    break;

            }
        }
    }
}