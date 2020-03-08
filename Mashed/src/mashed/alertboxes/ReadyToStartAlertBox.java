package mashed.alertboxes;

import mashed.scenes.subscenes.players.Player1;
import mashed.scenes.subscenes.players.PlayerAndAI;

public class ReadyToStartAlertBox extends ReadyAlertBox{

	public ReadyToStartAlertBox(String message, String buttonText,  boolean pvp){
		super(message, buttonText);
		
		// What closeButton (the one that displays "Yes!") does on action
		button(pvp);
		
		// Display the alert box
		display();
	}
	
	private void button(boolean pvp) {
        
        // If it is "Player vs Player" mode
        if(pvp) {
        	
        	// When you click on the button that displays "Yes!"
        	closeButton.setOnAction(e -> {
        		
        		// It closes the alert box window
        		window.close();
        		
        		// Start the game of "Player vs Player" mode
        		Player1 player1 = new Player1();
        	});
        	
        // If it is "Player vs AI" mode
        }else {
        	
        	// When you click on the button that displays "Yes!"
        	closeButton.setOnAction(e -> {
        		
        		// It closes the alert box window
        		window.close();
        		
        		// Start the game of "Player vs AI" mode
        		PlayerAndAI playerAndAI = new PlayerAndAI();
        	});
        }
	}
}
