package com.programme;

import com.interpreter.engine.CanvasEngine;
import com.interpreter.Executor;
import com.interpreter.Interpreter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.programme.controllers.Controller;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        CanvasEngine canvasEngine = new CanvasEngine(controller.getLogoCanvas());
        Executor executor = new Executor(canvasEngine);
        Interpreter interpreter = new Interpreter(executor, controller);

        stage.setTitle("Logo translator");
        Scene scene = new Scene(root, 1360, 760);
        scene.getStylesheets().add(getClass().getResource("logoStyle.css").toString());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
