package mashed.gameplay;

import mashed.alertboxes.HitAlertBox;

public class PlayerVSPlayer extends Gameplay{
	
	// Boolean variable that checks if it is the first or the second player's turn
	public static boolean player1;
	
	public static void headButton() {
		// If player1 attacks
		if(player1) {
			
			// Attack player2 health
			attackHead(player2HP);
			
			// Update player2 health
			setPlayer2HP(HPAttacked);
			
		// If player2 attacks
		}else{
			
			// Attack player1 health
			attackHead(player1HP);
			
			// Update player2 health
			setPlayer1HP(HPAttacked);
		}
	}
	
	public static void bodyButton() {
		// If player1 attacks
		if(player1) {
			
			// Work with player2 health
			attackBody(player2HP);
			
			// Update player2 health
			setPlayer2HP(HPAttacked);
			
		// If player2 attacks
		}else{
			
			// Work with player1 health
			attackBody(player1HP);
			
			// Update player1 health
			setPlayer1HP(HPAttacked);
		}
	}
	
	public static void legsButton() {
		// If player1 attacks
		if(player1) {
			
			// Attack player2 health
			attackLegs(player2HP);
			
			// Update player2 health
			setPlayer2HP(HPAttacked);
			
		// If player2 attacks
		}else{
			
			// Attack player1 health
			attackLegs(player1HP);
			
			// Update player1 health
			setPlayer1HP(HPAttacked);
		}
	}
	
	public static void alertBox() {// displays alert boxes depending on the hit outcome
		
		// If both players are alive and the last hit didn't miss
		if(hit != 0 && player1HP > 0 && player2HP > 0) {
			
			// Display an alert box with feedback from the last hits
			HitAlertBox endOfTurn = new HitAlertBox("You hit your enemy by " + hit + " HP!", "OK");
			
		// If both players are alive but the last hit was a miss	
		}else if( hit == 0 && player1HP > 0 && player2HP > 0) {
			
			// Display an alert box with feedback about the last hit
			HitAlertBox endOfTurn = new HitAlertBox("You missed!" , "OK");
		}
	}
}