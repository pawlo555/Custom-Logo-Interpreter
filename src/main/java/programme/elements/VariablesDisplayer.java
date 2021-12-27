package programme.elements;

import interpreter.Environment;
import javafx.scene.control.TextArea;

import java.util.List;
import java.util.Set;

public class VariablesDisplayer extends TextArea {

    private Environment environment;

    private void displayVariables() {
        StringBuilder environmentStateBuilder = new StringBuilder();
        Set<String> variablesNames = environment.getVariablesNames();
        for (String variableName: variablesNames) {
            String value = environment.getVariable(variableName).getStringValue();
            environmentStateBuilder.append(environmentStateBuilder)
                    .append(" : ")
                    .append(value)
                    .append("\n");
        }
        this.setText(environmentStateBuilder.toString());
    }


    private void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
