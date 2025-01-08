package SystemDesign.LLD.ParkingLot;

public class ParkingSpot {
	
	int id;
	boolean isEmpty ;
	Vehicle vehicle ;
	
	public ParkingSpot(int id) {
		this.id = id;
		this.isEmpty = true;
		this.vehicle = null;
	}

	public int getId() {
		return id;
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void parkVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.isEmpty = false; 
	}
	public void unparkVehicle() {
		this.vehicle = null;
		this.isEmpty = true; 
	}

	
	
	
	

}
