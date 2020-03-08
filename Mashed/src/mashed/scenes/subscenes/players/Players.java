package mashed.scenes.subscenes.players;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import mashed.gameplay.Gameplay;
import mashed.scenes.subscenes.SubScenes;

public class Players extends SubScenes{
	// All variables are default as they need to be accessed within this package
	Button head, body, legs; // buttons for the gameplay
	
	//Labels that display each player's health
	static Label player1Health;
	static Label player2Health;
	
	public Players(int x ) {
		// Create a return button
		createBackButton();
		
		// Create 3 areas (buttons) to attack (click) - for the gameplay
		createItems(x);
		
		// Display the window
		setScenes(layout, "gamemodes.css");
	}
	
	public void createItems(int x ){
		// Instantiating Button class
		head = new Button("Head");
		body = new Button("Body");
		legs = new Button("Legs");
		
		// Give coordinates to the buttons
		GridPane.setConstraints(head, x, 10);
		GridPane.setConstraints(body, x, 11);
		GridPane.setConstraints(legs, x, 12);
		
		// Instantiating the Label objects
		player1Health = new Label();
		player2Health = new Label();
		
		// Give coordinates to the labels
		GridPane.setConstraints(player1Health, 1, 1);
		GridPane.setConstraints(player2Health, 9, 1);
		
		// Insert buttons in the layout
		layout.getChildren().addAll(head, body, legs, player1Health, player2Health);
		
		// Display labels for the first time
		displayLabels();
	}
	
	public static void displayLabels() {
		//Setting text to labels
		player1Health.setText(Gameplay.player1HP + " HP");
		player2Health.setText(Gameplay.player2HP + " HP");
	}
}
