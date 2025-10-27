module org.nes {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;
    exports org.nes.model.data;
    opens org.nes to com.google.gson;
    exports org.nes;
    opens org.nes.controller to javafx.fxml;
}