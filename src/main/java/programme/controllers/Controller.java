package programme.controllers;

import interpreter.Interpreter;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import programme.elements.Console;
import programme.elements.ErrorOutput;
import programme.elements.LynxCanvas;

public class Controller {

    @FXML private LynxCanvas lynxCanvas;
    @FXML private Console console;
    @FXML private ErrorOutput error_reporter;
    @FXML private TextArea programmeContent;
    @FXML private VBox programmeVBox;
    @FXML private TextArea environment;

    public Interpreter interpreter;

    public LynxCanvas getLynxCanvas() {
        return lynxCanvas;
    }

    public Console getConsole() {return console;}

    @FXML
    private void loadConsole() {
        console.setVisible(true);
        programmeVBox.setVisible(false);
        environment.setVisible(false);
    }

    @FXML
    private void loadProcedures() {
        console.setVisible(false);
        programmeVBox.setVisible(true);
        environment.setVisible(false);
        System.out.println("Loading procedures");
    }

    @FXML
    private void loadEnvironment() {
        console.setVisible(false);
        programmeVBox.setVisible(false);
        environment.setVisible(true);
    }

    @FXML
    private void loadFile() {
        System.out.println("Loading file");
    }

    @FXML
    private void clean() {
        System.out.println("Cleaning");
    }

    @FXML
    private void executeProgramme() {
        System.out.println("Execute programme");
    }

    public ErrorOutput getErrorLabel() {
        return error_reporter;
    }

    public void setInterpreter(Interpreter interpreter) {
        this.interpreter = interpreter;
    }
}
