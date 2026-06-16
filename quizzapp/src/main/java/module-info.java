module com.nvt.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nvt.quizzapp to javafx.fxml;
    exports com.nvt.quizzapp;
}
