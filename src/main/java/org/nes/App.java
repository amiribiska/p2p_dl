package org.nes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;


public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        URL fxmlUrl = getClass().getResource("/mainFrame.fxml");
        System.out.println(fxmlUrl); // Debug: should print something like file:/.../mainFrame.fxml

        Parent root = FXMLLoader.load(fxmlUrl);
        stage.setTitle("P2P Downloader");
        stage.setScene(new Scene(root));
        stage.show();
    }

}