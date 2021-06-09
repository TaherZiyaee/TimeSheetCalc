package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MySample.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("ISC TimeSheet Calculator");
        primaryStage.setScene(new Scene(root));

        Controller controller = new Controller();

        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}