package mashed.alertboxes;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import mashed.scenes.subscenes.players.PlayerAndAI;

public class AIHitAlertBox extends AlertBox{

	public AIHitAlertBox(String message, String message2, String buttonText) {
		// Pass the message and text for the close button to the constructor of the superclass("AlertBox") 
		super(message, buttonText);
		
		// Change the layout of a usual alert box
		layout(message2);
		
		// Display the alert box
		display();
	}

	private void layout(String message2) {
		
		// The label displaying the AI message
		Label label2 = new Label(message2);
		
        // Add the label to the layout
        layout.getChildren().add(label2);
        
        // What closeButton does on click
		closeButton.setOnAction(e -> {
			
			// Update the labels
			PlayerAndAI.displayLabels();
			
			// Close the window
			window.close();
			});
		
		// Set coordinates to the layout elements
		GridPane.setConstraints(label, 5, 5);
		GridPane.setConstraints(label2, 5, 6);
		GridPane.setConstraints(closeButton, 5, 20);
	}
	
}
