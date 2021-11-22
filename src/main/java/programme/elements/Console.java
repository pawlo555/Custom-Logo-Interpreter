package programme.elements;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class Console extends VBox {
    @FXML private final TextArea prevCommands = new TextArea();
    @FXML private final TextArea currentCommand = new TextArea();

    private final static String prefix = ">>>";

    public Console() {
        this.setPrefSize(340, 600);
        prevCommands.setPrefSize(540, 560);
        currentCommand.setPrefSize(340, 20);
        this.getChildren().addAll(prevCommands, currentCommand);
        this.setFillWidth(true);
        newCommand();

        currentCommand.addEventHandler(KeyEvent.KEY_RELEASED, keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                enterPressed();
            }
        });
    }

    private void enterPressed() {
        String commandText = currentCommand.getText();
        String textToPreviousCommands = prevCommands.getText() + commandText;
        prevCommands.setText(textToPreviousCommands);
        newCommand();
    }

    private void newCommand() {
        currentCommand.clear();
        currentCommand.setText(prefix);
        currentCommand.positionCaret(prefix.length());
    }
}
