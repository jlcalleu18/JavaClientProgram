package edu.citytech.counter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class GPExample extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("I made it Javafx");
        primaryStage.setTitle("Counter Example ABC: Calle, Jorge");

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: white; -fx-padding: 30 0 0 100");

        var abc = ABCCounterService.getABC();
        Label label = new Label("Message");
        int column =0 , row = 0;
        for (Character character:abc) {
            var button = new Button(character.toString());
            button.setMinWidth(51);
            button.setStyle("-fx-border-color: black;-fx-padding: 10;");

            button.setOnAction(e->{
                var node = (Button)e.getSource();
                label.setText(node.getText());
            });
            gridPane.add(button,column++,row);

            if (column>4){
                row++;
                column=0;
            }
        }


        label.setMinWidth(300);
        label.setStyle("-fx-border-color: black;-fx-background-color: white;-fx-padding: 10");
        gridPane.add(label, 0,row++,5,1);

        gridPane.setHgap(10);
        gridPane.setVgap(10);


        Scene scene = new Scene(gridPane,400,400);


        primaryStage.setScene(scene);

        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
}
