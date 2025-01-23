package SystemDesign.LLD.SnakeAndLadder;

public class Board {
	
	private Cell[] arr;
	private int size ;

	public Board(int size) {
		this.size = size;
		arr =  new Cell[size] ;
	}

	public int getSize() {
		return size;
	}
	
	public boolean insertJump(Jump jump ) {
		
		int start = jump.getStart() ;
		
		if(arr[start] != null) {
			return false;
		}
		
		arr[start] =  new Cell(jump) ;
		
		
		return true;
		
		
	}
	
	public Cell getCell(int pos) {
		return arr[pos] ;
	}
	
	

}
