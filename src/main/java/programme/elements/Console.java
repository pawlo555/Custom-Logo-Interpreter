package programme.elements;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class Console extends VBox {
    @FXML private final TextArea prevCommands = new TextArea();
    @FXML private final TextArea currentCommand = new TextArea();

    private final static String prefix = ">>>";

    public Console() {
        this.setPrefSize(340, 600);
        prevCommands.setPrefSize(540, 560);
        currentCommand.setPrefSize(340, 20);
        prevCommands.setText("Prev");
        currentCommand.setText("Current");
        this.getChildren().addAll(prevCommands, currentCommand);
        this.setFillWidth(true);
    }
}
