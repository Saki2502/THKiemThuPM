module com.saki2502.thuchanhktpm {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.saki2502.thuchanhktpm to javafx.fxml;
    exports com.saki2502.thuchanhktpm;
}
