package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Controller implements Initializable {

    @FXML
    public ChoiceBox<Integer> chbDaysOfMonth;
    public ChoiceBox<Integer> chbHolidays;
    public ChoiceBox<Integer> chbFridays;
    public ChoiceBox<Integer> chbFirstDay;


    public void setChbDaysOfMonth(ChoiceBox<Integer> chbDaysOfMonth) {
        chbDaysOfMonth.getItems().addAll(29,30,31);
        chbDaysOfMonth.setValue(30);
        this.chbDaysOfMonth = chbDaysOfMonth;
    }

    public void setChbHolidays(ChoiceBox<Integer> chbHolidays) {
        List<Integer> holidaysList = IntStream.rangeClosed(0,10).boxed().collect(Collectors.toList());
        chbHolidays.getItems().addAll(holidaysList);
        chbHolidays.setValue(0);
        this.chbHolidays = chbHolidays;
    }

    public void setChbFridays(ChoiceBox<Integer> chbFridays) {
        chbFridays.getItems().addAll(4,5);
        chbFridays.setValue(4);
        this.chbFridays = chbFridays;
    }

    public void setChbFirstDay(ChoiceBox<Integer> chbFirstDay) {
        chbFirstDay.getItems().addAll(21,22);
        chbFirstDay.setValue(21);
        this.chbFirstDay = chbFirstDay;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setChbDaysOfMonth(chbDaysOfMonth);
        setChbFirstDay(chbFirstDay);
        setChbFridays(chbFridays);
        setChbHolidays(chbHolidays);
    }
}
