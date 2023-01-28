module com.daniel.kwaterions {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;
	requires commons.math3;
	requires lombok;

    opens com.daniel.kwaterions to javafx.fxml;
    exports com.daniel.kwaterions;
}
