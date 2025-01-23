package SystemDesign.LLD.SnakeAndLadder;

import java.util.Random;

public class Dice {
	
	int sides ;
	private Random r ;
	
	public Dice(int sides) {	
		this.sides = sides;
		r =  new Random();
	}
	
	public int rollDice() {
		
		
		return r.nextInt( this.sides )+ 1;
		
	}
	
	
	

}
