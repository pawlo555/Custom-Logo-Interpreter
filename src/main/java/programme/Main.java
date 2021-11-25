package programme;

import interpreter.Engine;
import interpreter.Executor;
import interpreter.Interpreter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import programme.controllers.Controller;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        Engine engine = new Engine(controller.getLynxCanvas());
        Executor executor = new Executor(engine);
        Interpreter interpreter = new Interpreter(executor);
        controller.getConsole().addListener(interpreter);

        stage.setTitle("Lynx translator");
        stage.setScene(new Scene(root, 1280, 720));
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
