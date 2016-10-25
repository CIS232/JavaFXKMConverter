package edu.cis232;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class KilometerConverterApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Load the FXML
		Parent parent = FXMLLoader.load(getClass().getResource("KMConverter.FXML"));
		
		//Build the Scene graph
		Scene scene = new Scene(parent);
		
		//Set/display the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Kilometer Converter");
		
		primaryStage.show();
	}

}
