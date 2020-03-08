package mashed.alertboxes;

import javafx.scene.layout.GridPane;

public class HitAlertBox extends AlertBox{

	public HitAlertBox(String message, String buttonText) {
		// Passes the message and text for the close button to the constructor of the superclass("AlertBox") 
		super(message, buttonText);
		
		// Change the layout of usual alert box, specifies what the button does when pressed
		layout();
		
		// Display the alert box
		display();
	}

	private void layout() {	
		// Close the window when pressed
		closeButton.setOnAction(e -> window.close());
		
		// Set coordinates of the label and the button
		GridPane.setConstraints(label, 5, 5);
		GridPane.setConstraints(closeButton, 5, 30);
	}
}
