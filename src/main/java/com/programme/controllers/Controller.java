package com.programme.controllers;

import com.interpreter.Interpreter;
import com.programme.elements.*;
import com.programme.elements.Console;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class Controller {

    @FXML private LogoCanvas logoCanvas;
    @FXML private Console console;
    @FXML private TextArea errorReporter;
    @FXML private TextArea programmeContent;
    @FXML private VBox programmeVBox;
    @FXML private VariablesDisplayer variablesDisplayer;

    private Interpreter interpreter;

    public LogoCanvas getLogoCanvas() {
        return logoCanvas;
    }

    @FXML
    private void loadConsole() {
        console.setVisible(true);
        programmeVBox.setVisible(false);
        variablesDisplayer.setVisible(false);
    }

    @FXML
    private void loadProcedures() {
        console.setVisible(false);
        programmeVBox.setVisible(true);
        variablesDisplayer.setVisible(false);
    }

    @FXML
    private void loadEnvironment() {
        console.setVisible(false);
        programmeVBox.setVisible(false);
        variablesDisplayer.setVisible(true);
    }

    @FXML
    private void loadFile() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("."));
        fileChooser.setTitle("Choose a file");
        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            openFile(file);
        }
    }

    @FXML
    private void clean() {
        interpreter.getExecutor().getEnvironment().clean();
        variablesDisplayer.displayEnvironment();
    }

    @FXML
    private void executeProgramme() {
        String programme = programmeContent.getText();
        interpreter.executeCode(programme);
    }

    private void openFile(File file) throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder builder = new StringBuilder();
        String line;
        line = bufferedReader.readLine();
        while (line != null) {
            builder.append(line).append("\n");
            line = bufferedReader.readLine();
        }
        programmeContent.setText(builder.toString());
    }

    public TextArea getErrorLabel() {
        return errorReporter;
    }

    public VariablesDisplayer getDisplayer() {
        return variablesDisplayer;
    }

    public void setInterpreter(Interpreter interpreter) {
        this.interpreter = interpreter;
        this.console.addListener(interpreter);
        this.variablesDisplayer.setEnvironment(interpreter.getExecutor().getEnvironment());
        this.console.addListener(this.variablesDisplayer);
    }

    public void setStop() {
        interpreter.stopThread();
    }
}
