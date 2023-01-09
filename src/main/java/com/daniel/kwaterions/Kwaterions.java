package com.daniel.kwaterions;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform ;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class Kwaterions extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadFXML("/primary"), ReadOnly.X, ReadOnly.Y);
        scene.setOnKeyPressed(escape());
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
        ((Canvas)((Group)scene.getRoot()).getChildren().get(0)).setWidth(ReadOnly.X);
        ((Canvas)((Group)scene.getRoot()).getChildren().get(0)).setHeight(ReadOnly.Y);
        new Graph(((Canvas)((Group)scene.getRoot()).getChildren().get(0)));
    }

    

	private EventHandler<KeyEvent> escape() {
		return new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				Platform.exit();
				System.exit(0);
			}
		};
	}



	static void setRoot(String fxml) throws Exception {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Kwaterions.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}