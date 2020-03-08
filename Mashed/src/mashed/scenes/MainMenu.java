package mashed.scenes;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import mashed.alertboxes.ReadyToStartAlertBox;
import mashed.gameplay.Gameplay;
import mashed.scenes.subscenes.Tutorial;

public class MainMenu extends Scenes{
	
	public MainMenu() {
		
		// Make health of both players equal to a 1000, to start the game from the start every time
		Gameplay.player1HP = Gameplay.player2HP = 1000;
		
		// Create and add elements to the layout
		createItems();
		
		// Display the window
		setScenes(layout, "menu.css");
	}

	public void createItems() {
		// Create buttons
		Button openTutorial = new Button("           Tutorial           ");
		Button openPlayerVSplayer = new Button("Player vs Player mode");
		Button openPlayerVSai = new Button("   Player vs AI mode   ");
		
		// What buttons do on click:
		
		// The "Tutorial" button declares and instantiates a tutorial object(opens tutorial to the game)
		openTutorial.setOnAction(e -> {Tutorial tutorial = new Tutorial();});
		
		// "Player VS Player" button displays an alert box
		openPlayerVSplayer.setOnAction(e -> {
			
			// Instantiate an alert box class (display a window asking if you are sure, you want to start the game)
			// "true" parameter shows it's "Player vs Player" mode that the user chose 
			ReadyToStartAlertBox youReady = new ReadyToStartAlertBox("Do you want to start?", "Yes!", true);
		});
		
		// "Player vs AI" button displays an alert box
		openPlayerVSai.setOnAction(e -> {
			
			// Instantiate an alert box class (display a window asking if you are sure, you want to start the game)
			// "false" parameter shows it's "Player vs AI" mode that the user chose 
			ReadyToStartAlertBox youReady = new ReadyToStartAlertBox("Do you want to start?", "Yes!", false);
		});
		
		// Give coordinates to buttons
		GridPane.setConstraints(openTutorial, 6, 8);
		GridPane.setConstraints(openPlayerVSai, 6, 7);
		GridPane.setConstraints(openPlayerVSplayer, 6, 6);
		
		// Insert buttons in the layout
		layout.getChildren().addAll(openTutorial, openPlayerVSplayer, openPlayerVSai);
	}
}
