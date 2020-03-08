package mashed.scenes.subscenes.players;

import mashed.alertboxes.WinAlertBox;
import mashed.gameplay.Gameplay;
import mashed.gameplay.PlayerVSPlayer;

public class Player2 extends Players {
	
	public Player2(){
		// Set coordinates of buttons across x - axis in the layout in the superclass
		super(0);

		// State that this is the first player
		PlayerVSPlayer.player1 = false;
		
		// Create actions for the buttons on click
		createActions();	
	}
	
	private void createActions() {
		
		// When you click the head button
		head.setOnAction(e -> {	
			
			// A gameplay method is invoked
			PlayerVSPlayer.headButton();
			
			// If player1 health is less or equal than 0
			if(Gameplay.player1HP <= 0) {
				
				// Instantiate WinAlertBox class (display an alert box giving feedback about the game)
				WinAlertBox endOfGame = new WinAlertBox("Player 2 won!","Go back");
				
			// If player1 health is more than 0	
			}else {
				
				// Call the gameplay "alertBox" method
				PlayerVSPlayer.alertBox();
				
				// Instantiate Player1 class (switch the turn to the first player)
				Player1 player1 = new Player1();
			}
		});
		
		// When you click the body button
		body.setOnAction(e -> {
			
			// A gameplay method is invoked
			PlayerVSPlayer.bodyButton();
			
			// If player1 health is less or equal than 0
			if(Gameplay.player1HP <= 0) {
				
				// Instantiate WinAlertBox class (display an alert box giving feedback about the game)
				WinAlertBox endOfGame = new WinAlertBox("Player 2 won!","Go back");
				
			// If player1 health is more than 0	
			}else {
				
				// Call the gameplay "alertBox" method
				PlayerVSPlayer.alertBox();
				
				// Instantiate Player1 class (switch the turn to the first player)
				Player1 player1 = new Player1();
			}
		});
		
		// When you click the legs button
		legs.setOnAction(e -> {
			
			// A gameplay method is invoked
			PlayerVSPlayer.legsButton();
			
			// If player1 health is less or equal than 0
			if(Gameplay.player1HP <= 0) {
				
				// Instantiate WinAlertBox class (display an alert box giving feedback about the game)
				WinAlertBox endOfGame = new WinAlertBox("Player 2 won!","Go back");
				
			// If player1 health is more than 0
			}else {
				
				// Call the gameplay "alertBox" method
				PlayerVSPlayer.alertBox();
				
				// Instantiate Player1 class (switch the turn to the first player)
				Player1 player1 = new Player1();
			}
		});
	}
}
