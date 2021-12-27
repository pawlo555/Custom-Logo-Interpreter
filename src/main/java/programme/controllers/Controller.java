package programme.controllers;

import interpreter.Interpreter;
import javafx.fxml.FXML;
import programme.elements.Console;
import programme.elements.ErrorOutput;
import programme.elements.LynxCanvas;
import programme.elements.ProgramFile;

public class Controller {

    @FXML private LynxCanvas lynxCanvas;
    @FXML private Console console;
    @FXML private ProgramFile programFile;
    @FXML private ErrorOutput error_reporter;

    public Interpreter interpreter;

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

    public void setInterpreter(Interpreter interpreter) {
        this.interpreter = interpreter;
    }
}
