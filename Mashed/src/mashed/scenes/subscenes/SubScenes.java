package mashed.scenes.subscenes;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import mashed.alertboxes.ReadyToQuitAlertBox;
import mashed.scenes.Scenes;

public class SubScenes extends Scenes{

	public void createBackButton() {
		// Instantiate Button class and set text on it to "Back"
		Button back  = new Button(" Back "); 
		
		// On click button displays an alert box
		back.setOnAction(e -> {
			
			// Instantiate ReadyToQuitAlertBox class (ask if the user is sure he wants to quit)
			ReadyToQuitAlertBox youReady = new ReadyToQuitAlertBox("Do you want to quit?", "Yes");
		});
		
		// Set the position of the button
		GridPane.setConstraints(back, 0, 0);
		
		// Adds the button to the layout of the screen
		layout.getChildren().add(back);
	}
}
