package mashed.alertboxes;

import mashed.scenes.MainMenu;

public class ReadyToQuitAlertBox extends ReadyAlertBox{

	public ReadyToQuitAlertBox(String message, String buttonText) {
		super(message, buttonText);
		
		// What closeButton (the one that displays "Yes") does on action
		button();
		
		// Display the alert box
		display();
	}
	
	private void button() {
        	
        	// When you click on the button that displays "Yes!"
        	closeButton.setOnAction(e -> {
        		
        		// It closes the alert box window
        		window.close();
        		
    			// Switch to main menu state
    			MainMenu mainMenu = new MainMenu();
        	});
     }
}
