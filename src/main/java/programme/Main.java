package programme;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        System.out.println("Start to watch");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Lynx translator");
        System.out.println("Scene");
        stage.setScene(new Scene(root, 1280, 720));
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
