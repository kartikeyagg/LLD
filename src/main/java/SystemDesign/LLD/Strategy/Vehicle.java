package SystemDesign.LLD.Strategy;

public class Vehicle {
	
	private DriveAPI driveAPI;

	public Vehicle(DriveAPI driveAPI) {
		this.driveAPI = driveAPI;
	} 
	
	public void drive() {
		
		driveAPI.drive(); 
		
	}
	
	

}
