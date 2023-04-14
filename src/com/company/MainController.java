package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainController {

    @FXML
    private Line border1;

    @FXML
    private Line border2;

    @FXML
    private AnchorPane root;

    @FXML
    private GridPane gridPane;

    @FXML
    private ComboBox<String> moodPicker;

    @FXML
    private Button button;

    @FXML
    private Rectangle background;

    @FXML
    private Text feelingText;

    @FXML
    private TextField coffeeTextfield;

    @FXML
    private Text timeText;

    @FXML
    private ImageView coffeeImage;

    @FXML
    private Text howMuchCoffeeText;

    @FXML
    private ComboBox<String> timeOfDayPicker;

    @FXML
    void showCoffee(ActionEvent event) throws FileNotFoundException {
        String chosen = moodPicker.getValue();

        // change chosen string into int
        // awful mood equals 0
        // awesome mood equals 4
        //
        InputStream stream = new FileInputStream("src\\com\\company\\Przechwytywanie2.PNG");
        Image image = new Image(stream);
       coffeeImage.setImage(image);
    }

    @FXML
    void initialize(){
        moodPicker.getItems().addAll(com.company.Main.moods);
        timeOfDayPicker.getItems().addAll(Main.timesOfDay);

    }

}

// https://www.google.com/search?q=coffee+types+pngs&source=lnms&tbm=isch&sa=X&ved=2ahUKEwizz5PflKn-AhUPAhAIHfHuAX0Q_AUoAXoECAEQAw&biw=1920&bih=969&dpr=1#imgrc=02X4R1GUMBxLqM&imgdii=m0kPFuGTdIUASM




