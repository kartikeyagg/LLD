package SystemDesign.LLD.SnakeAndLadder;

public class Player {
	
	private int currentPos; 
	private String playerName;
	
	public Player( String playerName) {
		super();
		this.currentPos =  0 ;
		this.playerName = playerName;
	}
	
	public int getCurrentPos() {
		return currentPos;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setCurrentPos(int pos) {
		this.currentPos = pos;
	}

	@Override
	public String toString() {
		return "Player [currentPos=" + currentPos + ", playerName=" + playerName + "]";
	}
	
	
	
	
	

}
