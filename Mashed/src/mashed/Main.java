package mashed;

import mashed.scenes.MainMenu;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{ // inherits "Application", which allows me to use javaFX features
	
	// This is my main frame that is displayed at all states of my program
	public static Stage myFrame;
	
	@Override
	public void start(Stage frame) {// this frame has to be passed by default, to make use of it anywhere in my program, as it always exists I made a static copy of it	
		myFrame = frame;
		
		// Create main menu object (open main menu)
		MainMenu mainMenu = new MainMenu();
	}
	
	public static void main(String[] args) {
		// Call the start method
		launch(args); 
	}
}
