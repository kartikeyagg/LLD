package SystemDesign.LLD.SnakeAndLadder;

import java.util.ArrayList;

public class SnakeNLadderLauncher {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<Player> playerList = new ArrayList<Player>() ;
		
		playerList.add(new Player("Tim"));
		playerList.add(new Player("Elon"));
		playerList.add(new Player("Jeff"));
		
		
		Game game =  new Game(playerList, 6, 100, 5, 7) ;
		
		Player winner = game.playGame() ;
		
		
		System.out.println( " player won : " + winner );
		
		System.out.println("all player poses : ");
		
		for(Player p : playerList) {
			
			System.out.println(p);
			
		}
		

	}

}
