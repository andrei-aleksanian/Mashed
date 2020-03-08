package mashed.scenes.subscenes.players;

import mashed.alertboxes.WinAlertBox;
import mashed.gameplay.Gameplay;
import mashed.gameplay.PlayerVSPlayer;

public class Player1 extends Players {
	
	public Player1(){
		// Set coordinates of buttons across x - axis in the layout in the superclass
		super(10);
		
		// State that this is the first player
		PlayerVSPlayer.player1 = true;
		
		// Create actions for the buttons on click
		createActions();
		
	}

	private void createActions() {
		
		// When you click the head button
		head.setOnAction(e -> {
			
			// A gameplay method is invoked
			PlayerVSPlayer.headButton();
			
			// If player2 health is less or equal than 0
			if(Gameplay.player2HP <= 0) {
				
				// Instantiate the "WinAlertBox" (display an alert box giving feedback about the game)
				WinAlertBox endOfGame = new WinAlertBox("Player 1 won!","Go back");
				
			// If player2 health is more than 0
			}else {
				
				// Call the gameplay "alertBox" method 
				PlayerVSPlayer.alertBox();
				
				// Instantiate the player2 class (switch the turn to the second player)
				Player2 player2 = new Player2();
			}
		});
		
		// When you click the body button
		body.setOnAction(e -> {
			
			// A gameplay method is invoked
			PlayerVSPlayer.bodyButton();
			
			// If player2 health is less or equal than 0
			if(Gameplay.player2HP <= 0) {
				
				// Instantiate the "WinAlertBox" class (display an alert box giving feedback about the game)
				WinAlertBox endOfGame = new WinAlertBox("Player 1 won!","Go back");
				
			// If player2 health is more than 0	
			}else {
				
				// Call the gameplay "alertBox" method 
				PlayerVSPlayer.alertBox();
				
				// Instantiate the player2 class (switch the turn to the second player)
				Player2 player2 = new Player2();
			}
			
		});
		
		// When you click the legs button
		legs.setOnAction(e -> {
			
			// A gameplay method is invoked
			PlayerVSPlayer.legsButton();
			
			// If player2 health is less or equal than 0
			if(Gameplay.player2HP <= 0) {
				
				// Instantiate the "WinAlertBox" class(display an alert box giving feedback about the game)
				WinAlertBox endOfGame = new WinAlertBox("Player 1 won!","Go back");
				
			// If player2 health is more than 0		
			}else {
				// Call the gameplay "alertBox" method
				PlayerVSPlayer.alertBox();
				
				// Instantiate the player2 class (switch the turn to the second player)
				Player2 player2 = new Player2();
			}
		});
	}
}
