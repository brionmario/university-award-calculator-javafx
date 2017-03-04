package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {





    @Override
    public void start(Stage primaryStage) throws IOException{

            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            primaryStage.setTitle("UNIVERSITY OF GUGSI - Login");
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
            primaryStage.setScene(new Scene(root, 720, 600));
            primaryStage.show();
            primaryStage.setResizable(false);

    }
    public static void main(String[] args) {

            launch(args);
        }
    }










