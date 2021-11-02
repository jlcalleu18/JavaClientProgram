package edu.citytech.tictactoe.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TicTacToeMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String name  = "TicTacToeView.fxml";
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(name));
        stage.setScene( new Scene(root));
        stage.setTitle("TicTacToe by: Jorge, Calle");
        stage.show();
//        stage.setHeight(774);
//        stage.setWidth(682);
//        stage.setResizable(false);
    }
}
