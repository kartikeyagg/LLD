package SystemDesign.LLD.TicKTackToe;

import java.util.ArrayList;

public class TickTackToeLauncher {
	
	public static void main(String[] args) {
		
		
		PlayingPiece p1 = new PieceX() ;
		PlayingPiece p2 = new PieceO() ;
		ArrayList<PlayingPiece> players = new ArrayList<PlayingPiece>() ;
		players.add(p1) ;
		players.add(p2) ;
		Game game = new Game(3,players ) ;
		
		game.startGame(); 
		
		
	}

}
