package programme;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import programme.controllers.Controller;
import programme.elements.Turtle;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();

        Turtle turtle = new Turtle(controller.getCanvas(), 100, 100);
        turtle.setDown();
        turtle.moveTo(200, 200);
        turtle.moveTo(300, 300);
        stage.setTitle("Lynx translator");
        stage.setScene(new Scene(root, 1280, 720));
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
