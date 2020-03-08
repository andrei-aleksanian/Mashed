package mashed.scenes;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import mashed.Main;

public class Scenes {
	
	// Declaring and instantiating layout of the window that it can be accessed through inheritance
	// This type of the layout allows to split the screen into identical cells
	protected GridPane layout = new GridPane();
	
	public void setScenes(GridPane layout, String path) {
		// Set padding from all sides, set the width and height of the cells of the layout
		layout.setVgap(25);
		layout.setHgap(69);
		layout.setPadding(new Insets(10,10,10,10));
		
		// Create a scene (what's inside a window)
		Scene scene = new Scene(layout, 960, 540);
				
		// Adding style sheet file
		scene.getStylesheets().add(path);
		
		// Insert the scene into the window
		Main.myFrame.setScene(scene);
		
		// Set the title of the game for the window
		Main.myFrame.setTitle("Mashed");
				
		// Window can't change its sizes
		Main.myFrame.setResizable(false);
				
		// Display the window
		Main.myFrame.show();
	}
}
