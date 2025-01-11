package SystemDesign.LLD.TicKTackToe;

public class Board {
	
	int size;
	PlayingPiece[][] arr;

	public Board(int size) {
		this.size = size;
		this.arr = new  PlayingPiece[size][size] ;
	}
	
	boolean addPiece(int i, int j, PlayingPiece p) {

		if (i < 0 || j < 0 || i >= size || j >= size) {
			return false;
		}

		if (arr[i][j] != null) {
			return false;
		}

		arr[i][j] = p;

		return true;

	}
	
	private boolean check(int i , int j,PlayingPiece p) {
		int count =0 ;
		for(int k =0  ; k<size;k++) {
			
			if(!this.arr[i][k].equals(p) ) {
				break;
			}
			
			else {
				count++ ;
			}
			
		}
		if( count == size) {
			return true; 
		}
		
for(int k =0  ; k<size;k++) {
			
			if(!this.arr[i][k].equals(p) ) {
				break;
			}
			
			else {
				count++ ;
			}
			
		}
		if( count == size) {
			return true; 
		}
		
		
		
		
	}
	
	
	@Override
	public String toString() {

		String s = "";

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {

				if (arr[i][j] == null) {
					s += "_";
				} else {
					s += arr[i][j];
				}

			}

			s += "\n";

		}

		return s;

	}
	

}
