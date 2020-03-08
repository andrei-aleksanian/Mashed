package mashed.gameplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gameplay {
	static int HPAttacked; // Store the HP that got attacked this turn to then update it
	static int hit; // The damage dealt in each turn
	
	// Health of each player
	public static int player1HP = 1000;
	public static int player2HP = 1000;
	
	// Minimal damage each turn
	static int normalDamage = 50;
	
	// Random object for calculating extra damage for each area
	static Random rand = new Random();
	
	// Array list of the hits of each turn
	public static List<Integer> hits = new ArrayList<Integer>();
	
	public static void attackHead(int hpAttacked){ // hpAttacked is the health of the player that got attacked
		
		// Setting chance to hit
		double hitChance = Math.random();
		
		// Setting extra damage modifier for head
		double hitModifier = 1.5 + (0.5) * rand.nextDouble();
		
		// Chance of 50% for attack, 50% for a miss
		// If you hit
		if(hitChance < 0.5) {
			
			// Hit is increased by the hit modifier
			hit = (int)(normalDamage*hitModifier);
			
			// Decrease the health by the value of hit
			hpAttacked = hpAttacked - hit;
			
			// Make "HPAttacked" equal to "hpAttacked" to then update the health of current player in a different method 
			HPAttacked = hpAttacked;
			
		// If you miss	
		}else {
			// Hit is equal to 0
			hit = 0;
			// Make "HPAttacked" equal to "hpAttacked" to then update the health of current player in a different method 
			HPAttacked = hpAttacked;
		}
		// Add the last hit to the end of the list of hits
		hits.add(hit);
	}
	
	public static void attackBody(int hpAttacked){ // hpAttacked is the health of the player that got attacked
		
		// Setting chance to hit
		double hitChance = Math.random();
		
		// Setting extra damage modifier for body
		double hitModifier = 1.0 + (0.1) * rand.nextDouble();
		
		// Chance of 95% for attack, 5% for a miss
		// If you hit
		if(hitChance < 0.95) {
			
			// Hit is increased by the hit modifier
			hit = (int)(normalDamage*hitModifier);
			
			// Decrease the health by the value of hit
			hpAttacked = hpAttacked - hit;
			
			// Make "HPAttacked" equal to "hpAttacked" to then update the health of current player in a different method 
			HPAttacked = hpAttacked;
			
		// If you miss	
		}else {
			// Hit is equal to 0
			hit = 0;
			
			// Make "HPAttacked" equal to "hpAttacked" to then update the health of current player in a different method
			HPAttacked = hpAttacked;
		}
		// Add the last hit to the end of the list of hits
		hits.add(hit);
	}
	
	public static void attackLegs(int hpAttacked){
		
		// Setting chance to hit
		double hitChance = Math.random();
		
		// Setting extra damage modifier for legs area
		double hitModifier = 1.1 + (0.4) * rand.nextDouble();
		
		// Chance of 70% for attack, 30% for a miss
		// If you hit
		if(hitChance < 0.7) {
			// Hit is increased by the hit modifier
			hit = (int)(normalDamage*hitModifier);
			
			// Decrease the health by the value of hit
			hpAttacked = hpAttacked - hit;
			
			// Make "HPAttacked" equal to "hpAttacked" to then update the health of current player in a different method
			HPAttacked = hpAttacked;
		
		// If you miss	
		}else {
			// Hit is equal to 0
			hit = 0;
			
			// Make "HPAttacked" equal to "hpAttacked" to then update the health of current player in a different method
			HPAttacked = hpAttacked;
		}
		// Add the last hit to the end of the list of hits
		hits.add(hit);
	}
	
    public static List<Integer> bubbleSort(int n){ // passing the size of the list left
    	
        // Stop the recursion if there is only one element left
        if (n == 1)
            return hits;
      
        // While there are elements in the list
        for (int i=0; i<hits.size()-1; i++)
        	
        	// If the current element is bigger than the next
            if (hits.get(i) > hits.get(i+1)){
            	
                // Swap the elements
                Integer temp = hits.get(i);
                hits.set(i, hits.get(i+1));
                hits.set(i+1, temp);
            }
      
        // Call the method itself again to sort the next element, decrease the amount of the elements left
        return bubbleSort(n-1);
    }
	
	// Updates health of first player to his new health after his opponent's attack
	public static void setPlayer1HP(int newHP) {
		player1HP = newHP;
	}
	
	// Updates health of second player to his new health after his opponent's attack
	public static void setPlayer2HP(int newHP) {
		player2HP = newHP;
	}
}
