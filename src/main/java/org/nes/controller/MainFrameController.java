package org.nes.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.nes.model.DownloadManager;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainFrameController implements Initializable {

    @FXML
    private Button addFileButton;

    @FXML
    private TextField fileTextField;

    private Stage stage;

    private DownloadManager downloadManager;

    public void setStage(Stage stage) {
        this.stage = stage;
        this.downloadManager = new DownloadManager();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addFileButton.setOnAction(e -> openFileChooser(this.stage));
    }

    private void openFileChooser(Stage stage){
        Platform.runLater(() -> {
            File file = new FileChooser().showOpenDialog(stage);
            if (file != null) {
                String path = file.getPath();
                System.out.println(path);
                fileTextField.setText(path);
                this.downloadManager.addDownloadFile(path);

            }
        });
    }
}