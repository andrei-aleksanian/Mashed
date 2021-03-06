package mashed.scenes.subscenes.players;

import mashed.gameplay.PlayerVSAI;

public class PlayerAndAI extends Players{

	public PlayerAndAI() {
		// Set coordinates of buttons across x - axis in the layout in the superclass
		super(10);
		
		// Create actions for the buttons on click
		createActions();
	}

	private void createActions() {
		
		// When you click the head button
		head.setOnAction(e -> {	
			
			// A gameplay method is invoked
			PlayerVSAI.headButton();
		});
		
		body.setOnAction(e -> {
			
			// A gameplay method is invoked
			PlayerVSAI.bodyButton();
		});
		
		legs.setOnAction(e -> {
			
			// A gameplay method is invoked
			PlayerVSAI.legsButton();
		});
	}
}
