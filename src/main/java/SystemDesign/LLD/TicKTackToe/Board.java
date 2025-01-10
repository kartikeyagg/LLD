package SystemDesign.LLD.TicKTackToe;

public class Board {
	
	int size;
	PlayingPiece[][] arr;

	public Board(int size) {
		this.size = size;
		this.arr = new  PlayingPiece[size][size] ;
	}
	
	

}
