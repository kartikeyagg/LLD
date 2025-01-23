package SystemDesign.LLD.SnakeAndLadder;

import java.util.ArrayList;
import java.util.Random;

public class Game {

	private ArrayList<Player> playerList;
	private Board board;
	private Dice dice;

	public Game(ArrayList<Player> playerList, int diceSize, int boardSize, int numberOfSnakes, int numberOfLadders)
			throws Exception {

		if (numberOfSnakes + numberOfLadders > boardSize) {
			throw new Exception("Invalid Input ");
		}

		this.playerList = playerList;
		this.dice = new Dice(diceSize);
		this.board = new Board(boardSize);
		this.addLadder(numberOfLadders);
		this.addSnakes(numberOfSnakes);

	}

	private void addSnakes(int numberOfSnakes) {

		Random r = new Random();

		while (numberOfSnakes > 0) {

			int start = r.nextInt(this.board.getSize()-1) + 1;

			int end = r.nextInt(start);

			boolean b = board.insertJump(new Jump(end, start));

			if (b) {
				numberOfSnakes--;

			}

		}

	}

	private void addLadder(int ladders) {

		Random r = new Random();

		while (ladders > 0) {
			int start = r.nextInt(this.board.getSize()-2);

			int end = r.nextInt(start + 1, this.board.getSize());

			boolean b = board.insertJump(new Jump(end, start));

			if (b) {
				ladders--;

			}
			
			

		}

	}
	
	private void movePlayer( Player p, int moves ) {
		
		int newPos = p.getCurrentPos() + moves;
		if(newPos >= this.board.getSize()) {
			return ;
		}
		
		while(this.board.getCell(newPos) != null) {
			
			newPos = this.board.getCell(newPos).getJump().getEnd() ;
			
		}
		
		p.setCurrentPos(newPos);
		
		return;
		
	}

	public Player playGame() {
		
		
		Player currPlayer= null ;
		
		while(true) {
			
			for(Player pl : this.playerList) {
				
				currPlayer = pl; 
				
				int hops = this.dice.rollDice() ;
				
				this.movePlayer(currPlayer, hops);
				
				if(currPlayer.getCurrentPos() == this.board.getSize() -1) {
					return currPlayer;
				}
				
			}
			
		}
		
		

	}

}

























