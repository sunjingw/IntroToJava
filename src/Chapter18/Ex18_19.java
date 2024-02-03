package Chapter18;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex18_19 extends Application {
    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Ex18_19Pane trianglePane = new Ex18_19Pane();
        //TextField tfOrder = new TextField();
        //tfOrder.setOnAction(e -> trianglePane.setOrder(tfOrder));
        //tfOrder.setPrefColumnCount(4);
        //tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

        HBox hbox = new HBox(10);
        Button minus = new Button("-");
        Button plus = new Button("+");

        AtomicInteger tfOrder = new AtomicInteger(0);

        minus.setOnAction(e -> {

            if (tfOrder.get() == 0) {

            } else {

                tfOrder.getAndDecrement();
                trianglePane.setOrder(tfOrder.get());
            }
        });

        plus.setOnAction(e -> {

            tfOrder.getAndIncrement();
            trianglePane.setOrder(tfOrder.get());

        });

        hbox.getChildren().addAll(minus, plus);
        //hbox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
        hbox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(trianglePane);
        borderPane.setBottom(hbox);

        Scene scene = new Scene(borderPane, 200, 210);
        stage.setTitle("Ex18_19");
        stage.setScene(scene);
        stage.show();

        scene.widthProperty().addListener(ov -> trianglePane.paint());
        scene.heightProperty().addListener(ov -> trianglePane.paint());
    }

    static class Ex18_19Pane extends Pane {
        private int order = 0;

        public void setOrder(int order) {
            this.order = order;
            paint();
        }
        Ex18_19Pane() {

        }

        protected void paint() {
            Point2D p1 = new Point2D(getWidth() / 2, 10);
            Point2D p2 = new Point2D(10, getHeight() - 10);
            Point2D p3 = new Point2D(getWidth() - 10, getHeight() - 10);

            this.getChildren().clear();

            displayTriangles(order, p1, p2, p3);
        }

        private void displayTriangles(int order, Point2D p1, Point2D p2, Point2D p3) {
            if (order == 0) {
                Polygon triangle = new Polygon();
                triangle.getPoints().addAll(p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY());
                triangle.setStroke(Color.BLACK);
                triangle.setFill(Color.WHITE);

                this.getChildren().add(triangle);

            } else {

                Point2D p12 = p1.midpoint(p2);
                Point2D p23 = p2.midpoint(p3);
                Point2D p31 = p3.midpoint(p1);

                displayTriangles(order - 1, p1, p12, p31);
                displayTriangles(order - 1, p12, p2, p23);
                displayTriangles(order - 1, p31, p23, p3);
            }
        }
    }
}
