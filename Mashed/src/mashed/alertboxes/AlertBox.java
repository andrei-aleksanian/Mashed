package mashed.alertboxes;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox{
	Stage window = new Stage(); // the window of the alert box
	GridPane layout = new GridPane(); // the same layout as iin the "Scenes" class
	Button closeButton; // button that closes the alert box
	Label label; // label that displays the message passed to the class
	private String message; // the message that the label has to display
	private String buttonText; // the text that the closeButton displays
	
	public AlertBox(String message, String buttonText) {
		
		// Making instance variables equal the passed parameters 
		this.message = message;
		this.buttonText = buttonText;
		
		// Create the label and the button
		createItems();
	}
	
	private void createItems() {
		
		// Instantiate Label class, add message text
		label = new Label(message);
        
        // Instantiate Button class, set text for it
        closeButton = new Button(buttonText);
	}

	public void display() {
		
		// Set padding from all sides, set the cells sizes
		layout.setVgap(1);
		layout.setHgap(1);
		layout.setPadding(new Insets(10,10,10,10));
		
        // Add the label and the button to the layout
        layout.getChildren().addAll(label, closeButton);
				
		// The main window is inactive when this alert box is displayed
        window.initModality(Modality.APPLICATION_MODAL);
        
        // Create a scene with the layout and specified sizes 
        Scene scene = new Scene(layout, 190, 101);
        
        // Displays window and wait for it to be closed before returning
        window.setScene(scene);
        window.setResizable(false);
        window.showAndWait();
    }
}