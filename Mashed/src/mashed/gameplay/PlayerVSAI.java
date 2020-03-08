package mashed.gameplay;

import mashed.alertboxes.AIHitAlertBox;
import mashed.alertboxes.WinAlertBox;

public class PlayerVSAI extends Gameplay{

	// Messages for alert boxes
	private static String message, message2;
	
	public static void headButton() {	
		
		// Player1 attacks
		// Attack player2 health (the AI health)
		attackHead(player2HP);
		
		// Update player2 health
		setPlayer2HP(HPAttacked);
		
		
		// If AI health is less or equal to 0
		if(player2HP <= 0) {
			
			// Display an alert box with results of the game
			WinAlertBox endOfGame = new WinAlertBox("You won!","Go back");
			
		}else {
			// Update "message" depending on the hit outcome
			playerMessage();
		
			// AI attacks
			// Call a gameplay method
			aiAttacks();
		}
	}

	public static void bodyButton() {
		
		// Player1 attacks
		// Attack player2 health (the AI health)
		attackBody(player2HP);
		
		// Update player2 health
		setPlayer2HP(HPAttacked);
		
		// If AI health is less or equal to 0
		if(player2HP <= 0) {
			
			// Display an alert box with results of the game
			WinAlertBox endOfGame = new WinAlertBox("You won!","Go back");
			
		}else {
			// Update "message" depending on the hit outcome
			playerMessage();
		
			// AI attacks
			// Call a gameplay method
			aiAttacks();
		}
	}
	
	public static void legsButton() {
		
		// Player1 attacks
		// Attack player2 health (the AI health)
		attackLegs(player2HP);
		
		// Update player2 health
		setPlayer2HP(HPAttacked);
		
		// If AI health is less or equal to 0
		if(player2HP <= 0) {
			
			// Display an alert box with results of the game
			WinAlertBox endOfGame = new WinAlertBox("You won!","Go back");
			
		}else {
			// Update "message" depending on the hit outcome
			playerMessage();
		
			// AI attacks
			// Call a gameplay method
			aiAttacks();
		}
	}
	
	private static void playerMessage() {
		
		// If the last hit wasn't a miss and both players' health is more than 0
		if(hit != 0 && player1HP > 0 && player2HP > 0) {
		
			// Set message to information about the hit
			message = "You hit your enemy by " + hit + " HP!";
		
		// If the last hit was a miss and both players' health is more than 0
		}else if(hit == 0 && player1HP > 0 && player2HP > 0) {
			
			// Set message to "You missed"
			message = "You missed!";
		}
		
	}
	
	private static void aiAttacks() {
		
		// Randomly choose an area the AI will attack
		chooseAiArea();
		
		// Update player2 health
		setPlayer1HP(HPAttacked);
		
		// If the player health is less or equal to 0
		if(player1HP <= 0){
			
			// Display an alert box with results of the game
			WinAlertBox endOfGame = new WinAlertBox("You lost!","Go back");
			
		// If the player health is more than 0
		}else {
			
			// Update "message2" depending on the hit outcome
			aiMessage();
		}
	}
	
	private static void chooseAiArea() {
		
		// Chance of 33% for each outcome in the if statement
		if(rand.nextInt(3) == 0) {
			
			attackHead(player1HP);
			
		}else if(rand.nextInt(3) == 1 || rand.nextInt(3) == 2) {
			
			attackBody(player1HP);
			
		}else{
			attackLegs(player1HP);
		}
	}
	
	private static void aiMessage() {
		
		// If the last hit wasn't a miss and both players' health is more than 0
		if(hit != 0 && player1HP > 0 && player2HP > 0) {
			
			// Set message to information about the hit
			message2 = "Your enemy hit you by " + hit + " HP!";
			
		// If the last hit was a miss and both characters' health is more than 0
		}else if(hit == 0 && player1HP > 0 && player2HP > 0) {
			
			// Set message to "Your enemy missed"
			message2 = "Your enemy missed!";
		}
		
		// Display an end of turn alert box
		displayAlertBox();
	}

	public static void displayAlertBox() {
		
		// If both players are alive
		if(player1HP > 0 && player2HP > 0) {
			
			// Display an alert box with feedback about the last hits
			AIHitAlertBox endOfTurn = new AIHitAlertBox(message, message2, "OK");
		}
	}
}
