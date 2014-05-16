package src.code.main;

import javafx.application.Application;
import javafx.stage.Stage;

public class FencingLaunch extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        LoadScenes scenes = new LoadScenes();
        primaryStage.setTitle("SAC Fencing Software - by Timothy Kierzkowski and Susanna Dong");
        primaryStage.setScene(scenes.getMainScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
