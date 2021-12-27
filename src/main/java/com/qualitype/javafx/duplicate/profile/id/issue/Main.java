package com.qualitype.javafx.duplicate.profile.id.issue;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class.
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override public void start(Stage primaryStage) throws Exception {
		var url = getClass().getResource("Main.fxml");
		var root = (Parent) FXMLLoader.load(url);
		var scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX");
		primaryStage.show();
	}

}
