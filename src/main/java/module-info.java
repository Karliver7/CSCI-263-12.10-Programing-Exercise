module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    exports com;

    opens com.example.demo to javafx.fxml;
}