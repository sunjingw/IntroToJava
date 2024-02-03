package Chapter20;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

public class Ex20_09 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        MultipleBallPane ballPane = new MultipleBallPane();
        ballPane.setStyle("−fx−border−color: yellow");

        Button btAdd = new Button("+");
        Button btSubtract = new Button("−");
        Button btPause = new Button("Suspend");
        Button btResume = new Button("Resume");
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btPause, btResume, btAdd, btSubtract);
        hBox.setAlignment(Pos.CENTER);

        // Add or remove a ball
        btAdd.setOnAction(e -> ballPane.add());
        btSubtract.setOnAction(e -> ballPane.subtract());
        btPause.setOnAction(e -> ballPane.pause());
        btResume.setOnAction(e -> ballPane.play());

        // Pause and resume animation
        //ballPane.setOnMousePressed(e -> ballPane.pause());
        //ballPane.setOnMouseReleased(e -> ballPane.play());
        ballPane.setOnMouseReleased(e -> {

            Iterator<MultipleBallPane.Ball> iterator = ballPane.balls.iterator();
            while (iterator.hasNext()) {
                Node ball = iterator.next();
                if (ball.contains(e.getX(), e.getY())) {
                    //iterator.remove();
                    //ballPane.getBalls().remove((Node)iterator);
                    ballPane.getChildren().remove(ball);
                    ballPane.balls.remove(ball);
                }
            }

        });

        // Use a scroll bar to control animation speed
        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);

        // Create a scene and place the pane in the stage
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("Ex20_05"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private class MultipleBallPane extends Pane {
        private Timeline animation;
        private List<Ball> balls = new ArrayList<>();

        public MultipleBallPane() {
            // Create an animation for moving the ball
            animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play(); // Start animation
        }

        public void add() {
            Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
            Ball ball = new Ball(30, 30, new Random().nextInt(19) + 2, color);
            balls.add(ball);
            getChildren().add(ball);

        }

        public void subtract() {
            if (getChildren().size() > 0) {

                Collections.sort(balls, Comparator.comparing(Ball::getRadius));
                getChildren().remove(balls.get(balls.size()-1));
                balls.remove(balls.size()-1);

            }
        }

        public void play() {
            animation.play();
        }

        public void pause() {
            animation.pause();
        }

        public void increaseSpeed() {
            animation.setRate(animation.getRate() + 0.1);
        }

        public void decreaseSpeed() {
            animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
        }

        public DoubleProperty rateProperty() {
            return animation.rateProperty();

        }

        protected void moveBall() {

            Ball ball = new Ball(1, 1, 1, Color.BLACK);
            Ball ball2 = new Ball(1, 1, 1, Color.BLACK);

            for (Node node : this.getChildren()) {
                ball = (Ball) node;

                //Ball ball = iterator.next();

                // Check boundaries
                if (ball.getCenterX() < ball.getRadius() ||
                        ball.getCenterX() > getWidth() - ball.getRadius()) {
                    ball.dx *= -1; // Change ball move direction
                }
                if (ball.getCenterY() < ball.getRadius() ||
                        ball.getCenterY() > getHeight() - ball.getRadius()) {
                    ball.dy *= -1; // Change ball move direction
                }


                // Adjust ball position
                ball.setCenterX(ball.dx + ball.getCenterX());
                ball.setCenterY(ball.dy + ball.getCenterY());

                for (Node e : this.getChildren()) {
                    ball2 = (Ball) e;

                    if (ball != ball2 && balls.indexOf(ball) < balls.indexOf(ball2) &&
                            ball.intersects(ball2.getBoundsInLocal())) {
                        ball.setRadius(ball.getRadius() + 5);
                        getChildren().remove(ball2);
                        remove(ball2);
                    }
                }
            }

//collisionDetection(ball1, ball2);
        }

        private void remove(Ball ball) {

            getChildren().remove(ball);
        }

        protected void collisionDetection(Ball ball, Ball newBall) {

            Iterator<Node> iterator = this.getChildren().iterator();
            while (iterator.hasNext()) {
                //Ball ball = (Ball) iterator.next();
               // Ball newBall = (Ball) iterator.next();

                if (ball != newBall && balls.indexOf(ball) < balls.indexOf(newBall) &&
                        ball.intersects(newBall.getBoundsInLocal())) {
                    iterator.remove();

                }
            }


//            int index = 0;
//
//            for (Node e : balls) {
//
//                if (balls.indexOf(ball) < balls.indexOf(e) &&
//                        ball.intersects(e.getBoundsInLocal())) {
//                    index = balls.indexOf(e);
//                }
//            }
//
//            if (index != 0) {
//                ball.setRadius(ball.getRadius() + 5);
//                getChildren().remove(balls.get(index));
//                balls.remove(balls.get(index));
//            }
        }

        class Ball extends Circle {
            private double dx = 1, dy = 1;

            Ball(double x, double y, double radius, Color color) {
                super(x, y, radius);
                setFill(color); // Set ball color
            }

            public static void main(String[] args) {

            }
        }
    }
}
