package Chapter20;

import java.util.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class Ex20_02 extends Application {
    private TextField numField = new TextField();
    private TextArea nums = new TextArea();
    private LinkedList<Integer> list = new LinkedList<>();
    private Button sort = new Button("Sort");
    private Button shuffle = new Button("Shuffle");
    private Button reverse = new Button("Reverse");

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane bpane = new BorderPane();
        bpane.setTop(getHBox());
        bpane.setCenter(displayText());
        bpane.setBottom(getBottomHBox());



        Scene scene = new Scene(bpane,400, 200);
        primaryStage.setTitle("Ex20_02");
        primaryStage.setScene(scene);
        primaryStage.show();

        //Let users enter numbers from a GUI
        numField.setOnAction(e -> {
            if (!isDuplicate(numField.getText())) { //Do not store duplicates
                list.add(Integer.parseInt(numField.getText())); //Store numbers in a linked list
                numField.clear();
                nums.setText(displayNums()); //Display them in a text area
            }

        } );

        //add buttons sort, shuffle, reverse
        sort.setOnAction(e -> {
            Collections.sort(list);
            nums.setText(displayNums());
        });

        shuffle.setOnAction(e -> {
            Collections.shuffle(list);
            nums.setText(displayNums());
        });

        reverse.setOnAction(e -> {
            Collections.reverse(list);
            nums.setText(displayNums());
        });

    }
    private HBox getHBox() {

        HBox hbox = new HBox(15);

        Label topLabel = new Label("Enter a number: ");

        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(topLabel, numField);

        return hbox;

    }

    private HBox getBottomHBox() {
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(sort,shuffle,reverse);
        return hbox;
    }

    private StackPane displayText() {

        StackPane sp = new StackPane();
        sp.getChildren().add(nums);

        return sp;
    }

    private String displayNums() {
        String numbers = "";
        for (Integer e : list) {
            numbers += e + " ";
        }

        return numbers;
    }

    private boolean isDuplicate(String s) {
        return list.contains(Integer.parseInt(s));
    }
}
