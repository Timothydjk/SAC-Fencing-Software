package src.code.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class EnterScreenController {
    @FXML
    private Text actiontarget;

    @FXML protected void enterAction(ActionEvent event) {
        actiontarget.setText("This will switch to main screen... eventually...");
    }
}
