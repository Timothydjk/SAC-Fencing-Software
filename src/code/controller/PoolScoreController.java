package src.code.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Created by Susanna Dong on 5/16/2014.
 */
public class PoolScoreController {
    @FXML
    private Label testLabel;
    private final static String[] RANDOM_PHRASES = {
            "You have just pressed the test button. Congratulations.",
            "Another phrase so you know that the button is throwing an action.",
            "Whoopie!"
    };
    private int tick;

    @FXML protected void calculatePool(ActionEvent event) {
        testLabel.setText(RANDOM_PHRASES[tick++%RANDOM_PHRASES.length]);
    }
}
