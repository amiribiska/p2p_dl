package org.nes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.nes.controller.MainFrameController;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainFrame.fxml"));
        Parent root = loader.load(); // Now the controller is instantiated

        MainFrameController controller = loader.getController();

        controller.setStage(stage);

        stage.setTitle("P2P Downloader");
        stage.setScene(new Scene(root));
        stage.show();
    }

}