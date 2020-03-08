package mashed.scenes.subscenes;

public class Tutorial extends SubScenes {
	
	public Tutorial() {
		// Create a button
		createItems();
		
		// Display the window
		setScenes(layout, "tutorial.css");
	}
	
	public void createItems() {
		// Creating one button that lets you return to main menu
		createBackButton();
	}
}
