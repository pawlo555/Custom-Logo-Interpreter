package programme.controllers;

import javafx.fxml.FXML;
import programme.elements.Console;
import programme.elements.ErrorOutput;
import programme.elements.LynxCanvas;

public class Controller {

    @FXML private LynxCanvas lynxCanvas;
    @FXML private Console console;
    @FXML private ErrorOutput error_reporter;

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

    public ErrorOutput getErrorLabel() {
        return error_reporter;
    }
}
