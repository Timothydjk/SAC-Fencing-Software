package src.code.main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Created by Susanna Dong on 5/16/2014.
 */
public class LoadScenes {

    public Scene mainScreen;

    public LoadScenes() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../../res/screens/sample.fxml"));
        mainScreen = new Scene(root, 600, 400);
    }

    public Scene getMainScene() {
        return mainScreen;
    }
}
