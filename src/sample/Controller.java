package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.util.stream.IntStream;

public class Controller {
    @FXML
    public ChoiceBox chbDaysOfMonth,chbHolidays,chbFridays,chbFirstDay;

    public Controller() {
        assignValueToChoiceBoxes();
    }

    private void assignValueToChoiceBoxes() {

        int[] daysArray = {29,30,31};
        chbDaysOfMonth = new ChoiceBox(FXCollections.observableArrayList(daysArray));
        chbDaysOfMonth.setItems(FXCollections.observableArrayList(daysArray));
        chbDaysOfMonth.getItems().addAll("daysArray");

        int[] holidaysArray = IntStream.rangeClosed(0,10).toArray();
        chbHolidays = new ChoiceBox(FXCollections.observableArrayList(holidaysArray));

        int[] fridaysArray = {4,5};
        chbFridays = new ChoiceBox(FXCollections.observableArrayList(fridaysArray));

        int[] firstDayArray = {21,22};
        chbFirstDay = new ChoiceBox(FXCollections.observableArrayList(firstDayArray));
    }
}
