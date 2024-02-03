package Chapter21;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex21_11 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        //Top Row
        ComboBox years = new ComboBox();
        years.getItems().addAll(
                "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"
        );

        //Middle Row
        ComboBox sex = new ComboBox();
        sex.getItems().addAll("Male", "Female");


        //Last Row
        TextField firstName = new TextField();
        Button ranking = new Button("Find Ranking");

        Label result = new Label();

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        //pane.setHgap(30);
        pane.add(new Label("Select a year:    "), 1,1);
        pane.add(years, 3,1);

        pane.add(new Label("Boy or girl?    "), 1, 2);
        pane.add(sex, 3, 2);

        pane.add(new Label("Enter a name:    "), 1, 3);
        pane.add(firstName, 3, 3);

        pane.add(ranking, 3, 4);
        pane.add(result, 1, 5);


        Scene scene = new Scene(pane, 350, 150);
        primaryStage.setTitle("Ex21_11");
        primaryStage.setScene(scene);
        primaryStage.show();

        Set<List<Map<String, Integer>>> boys = new LinkedHashSet<>();
        Set<List<Map<String, Integer>>> girls = new LinkedHashSet<>();

        readFile(boys, girls);

        System.out.println();

        ranking.setOnAction(e -> {
            int year = (Integer.parseInt(years.getValue().toString())) - 2001;
            String name = firstName.getText();

            if (sex.getValue().equals("Male")) {
                boys.forEach(f -> {

                    if (f.get(year).containsKey(name)) {
                        result.setText("Boy named " + name + " is ranked #" +
                                f.get(year).get(name) + " in year " + (year+2001));
                    } else {
                        result.setText("Nothing found");
                    }
                });
            } else {

                girls.forEach(g -> {
                    if (g.get(year).containsKey(name)) {
                        result.setText("Girl named " + name + " is ranked #" +
                                g.get(year).get(name) + " in year " + (year+2001));
                    } else {
                        result.setText("Nothing found");
                    }
                });
            }
        });
    }

    public static void readFile(Set<List<Map<String, Integer>>> boys, Set<List<Map<String, Integer>>> girls) throws FileNotFoundException {

        //each array holds all male years
        //Map<Integer, Map<String, Integer>> boyYear = new LinkedHashMap<>();
        //Map<Integer, Map<String, Integer>> girlYear = new LinkedHashMap<>();
        List<Map<String, Integer>> boyYear = new ArrayList<>();
        List<Map<String, Integer>> girlYear = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String path = "./src/Chapter21/baby/babynamesranking" + (2000+i) + ".txt";
            File file = new File(path);

            Map<String, Integer> boyNames = new LinkedHashMap<>();
            Map<String, Integer> girlNames = new LinkedHashMap<>();

            try (Scanner input = new Scanner(file)) {

                while (input.hasNextLine()) {
                    String[] line = input.nextLine().trim().split("\\s+");
                    int rank = Integer.parseInt(line[0]);

                    boyNames.put(line[1], rank);
                    girlNames.put(line[3], rank);
                }
            }

            boyYear.add(boyNames);
            girlYear.add(girlNames);
        }

        boys.add(boyYear);
        girls.add(girlYear);

    }
}
