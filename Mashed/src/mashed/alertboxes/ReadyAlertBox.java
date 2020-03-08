package mashed.alertboxes;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ReadyAlertBox extends AlertBox{
	
	// Button that cancels opening of the game
    Button noButton = new Button("No");

	public ReadyAlertBox(String message, String buttonText) {
		// Passes the message and text for the close button to the constructor of the superclass("AlertBox") 
		super(message, buttonText);
		
		// Add elements to the layout
		layout();
	}

	private void layout() {
        
        // Add noButton to the layout
        layout.getChildren().add(noButton);
		
		// Give coordinates to the buttons and the label
		GridPane.setConstraints(noButton, 5, 30);
		GridPane.setConstraints(closeButton, 6, 30);
		GridPane.setConstraints(label, 5, 5);
		
        // When you click the button that displays "No"
        noButton.setOnAction(e -> {
        	
        	// It closes the alert box window
        	window.close();
        });
	}
}
