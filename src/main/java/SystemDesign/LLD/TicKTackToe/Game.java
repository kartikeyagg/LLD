package SystemDesign.LLD.TicKTackToe;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	private Board board;
	private ArrayList<PlayingPiece> players;

	public Game(int size, ArrayList<PlayingPiece> players) {
		
		this.board = new Board(size) ;
		this.players = players;
		
	} 
	
	public void startGame() {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {

			for (PlayingPiece p : players) {

				int i;
				int j;

				do {
					System.out.println("play for player: " + p);
					i = sc.nextInt();
					j = sc.nextInt();
				} while (!board.addPiece(i, j, p));
				
				System.out.println(this.board);

				if (this.board.won) {
					System.out.println("Player :" + p + " won ");
					System.exit(0);
				}
			}
		}
		
		
	}
	
	
	

}
