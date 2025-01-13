package SystemDesign.LLD.LiftSystem;

public class Display {
	
	private int floor ;
	private Direction dir;
	
	public Display() {
		this.floor =0 ;
		this.dir = Direction.UP; 
	}
	
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public Direction getDir() {
		return dir;
	}
	public void setDir(Direction dir) {
		this.dir = dir;
	}
	
	

}
