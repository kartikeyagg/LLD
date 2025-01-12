package SystemDesign.LLD.TicKTackToe;

public class Board {
	
	int size;
	PlayingPiece[][] arr;
	boolean won = false;
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
		
		this.won = this.check( i, j, p) ;

		return true;

	}
	
	private boolean check(int i , int j,PlayingPiece p) {
		int count =0 ;
		for(int k =0  ; k<size;k++) {
			
			if(! p.equals( this.arr[i][k]  ) ) {
				break;
			}
			
			else {
				count++ ;
			}

		}
		if (count == size) {
			return true;
		}
		count = 0 ;

		for (int k = 0; k < size; k++) {

			if (!  p.equals(this.arr[k][j])) {
				break;
			}
			
			else {
				count++ ;
			}
			
		}
		if( count == size) {
			return true; 
		}
		
		if(!onDiagnol(i, j)) {
			return false ;
		}
		count = 0 ;
		
		for(int k =0  ; k<size ;k++) {
			
			if( p.equals( arr[k][k])) {
				count++ ;
			}
			else break ;
			
			
		}
		
		if(count == size) return true;
		
		for(int k = 0 ; k< size ; k++) {
			
			if(p.equals(arr[k][ -1+size -k ] ) ){
				count++ ;
			}
			else break ;
			
		}
		
		if(count == size) return true;
		
		return false; 
		
		
	}
	
	private boolean onDiagnol( int i, int j) {
		
		if(i==j) return true;
		
		if( i+j == size-1) return true;
		
		return false;
					
		
		
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
