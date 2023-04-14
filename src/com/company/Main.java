package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    Stage stage;

    public static List<String> moods = new ArrayList<>();

    public static List<String> timesOfDay = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        moods.add("Awesome");
        moods.add("Happy");
        moods.add("Alright");
        moods.add("Bad");
        moods.add("Awful");

        timesOfDay.add("6AM - 10AM");
        timesOfDay.add("11AM-2PM");
        timesOfDay.add("3PM-6PM");
        timesOfDay.add("7PM-9PM");
        timesOfDay.add("10PM-12AM");


        Parent root = FXMLLoader.load(getClass().getResource("MainLayout.fxml"));
        primaryStage.setScene(new Scene(root));

        stage = primaryStage;
        primaryStage.setTitle("Coffee");
        primaryStage.show();

    }


}

