package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.IntStream;

public class Controller implements Initializable {


    public ChoiceBox<Integer> chbDaysOfMonth;
//    public ChoiceBox<Integer> chbHolidays;


    public void setChbDaysOfMonth(ChoiceBox<Integer> chbDaysOfMonth) {

        this.chbDaysOfMonth = chbDaysOfMonth;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
