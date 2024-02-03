package Chapter18;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex18_20 extends Application {
    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {


        Circle c1 = new Circle(50);

        //c1.setFill(Color.TRANSPARENT);
        //c1.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 1;");
        StackPane stackPane = new StackPane();
        stackPane.setPrefSize(250, 250);
        stackPane.setAlignment(Pos.CENTER);
        System.out.println(stackPane.getPrefWidth());
        System.out.println(stackPane.getLayoutX());
        System.out.println(stackPane.getScaleX());
        System.out.println(stackPane.getMaxWidth());
        addCircles(stackPane, stackPane.getPrefWidth() - 10);

        Scene scene = new Scene(stackPane, 2 * stackPane.getPrefWidth(), 2 * stackPane.getPrefHeight());
        stage.setScene(scene);
        stage.setTitle("Ex18_20");
        stage.show();

    }

    public static void addCircles(StackPane sp, double n) {

        Circle circle = new Circle(n);
        circle.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 1;");

        if (n == 0) {

        } else {
            sp.getChildren().add(circle);
            addCircles(sp, n - 10);
        }
    }

}
