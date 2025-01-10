package SystemDesign.LLD.TicKTackToe;

public abstract class PlayingPiece {
	
	
	private PieceType pieceType;

	public PlayingPiece(PieceType pieceType) {
		super();
		this.pieceType = pieceType;
	}

	public PieceType getPieceType() {
		return pieceType;
	}
	
	

}
