package programme.controllers;

import javafx.fxml.FXML;
import programme.elements.LynxCanvas;

public class Controller {

    @FXML private LynxCanvas canvas;

    public LynxCanvas getCanvas() {
        return canvas;
    }
}
