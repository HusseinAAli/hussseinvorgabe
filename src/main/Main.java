package main;

import gui.CafesAnwendungssystem;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new CafesAnwendungssystem(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
