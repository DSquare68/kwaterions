module com.daniel.kwaterions {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;

    opens com.daniel.kwaterions to javafx.fxml;
    exports com.daniel.kwaterions;
}
