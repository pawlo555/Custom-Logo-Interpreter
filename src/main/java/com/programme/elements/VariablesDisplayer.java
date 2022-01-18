package com.programme.elements;

import com.interpreter.ConsoleListener;
import com.interpreter.Environment;
import javafx.scene.control.TextArea;

import java.util.Set;

public class VariablesDisplayer extends TextArea implements ConsoleListener {

    private Environment environment;

    public void displayEnvironment() {
        String variables = displayVariables();
        String procedures = displayProcedures();
        String environmentAsString = variables + "\n" + procedures;
        this.setText(environmentAsString);
    }

    private String displayVariables() {
        StringBuilder environmentStateBuilder = new StringBuilder();
        Set<String> variablesNames = environment.getVariablesNames();
        for (String variableName: variablesNames) {
            String value = environment.getVariable(":" + variableName).getStringValue();
            environmentStateBuilder.append(variableName)
                    .append(" : ")
                    .append(value)
                    .append("\n");
        }
        return environmentStateBuilder.toString();
    }

    private String displayProcedures() {
        StringBuilder proceduresBuilder = new StringBuilder();
        for (String procedureName: environment.getProceduresNames()) {
            proceduresBuilder.append(environment.getProcedure(procedureName).getBody())
                .append('\n');
        }
        return proceduresBuilder.toString();
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void executeCode(String command) {
        displayEnvironment();
    }
}
