package programme.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import programme.elements.Console;
import programme.elements.LynxCanvas;

public class Controller {

    @FXML private LynxCanvas lynxCanvas;
    @FXML private Console console;
    @FXML private Label error_reporter;

    public LynxCanvas getLynxCanvas() {
        return lynxCanvas;
    }

    public Console getConsole() {return console;}

    @FXML
    private void loadConsole() {
        System.out.println("Loading console");
    }

    @FXML
    private void loadProcedures() {
        System.out.println("Loading procedures");
    }

    @FXML
    private void loadFile() {
        System.out.println("Loading file");
    }

    @FXML
    private void clean() {
        System.out.println("Cleaning");
    }
}
