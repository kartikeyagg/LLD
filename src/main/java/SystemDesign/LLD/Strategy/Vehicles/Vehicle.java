package SystemDesign.LLD.Strategy.Vehicles;

import SystemDesign.LLD.Strategy.Drive.DriveAPI;

public class Vehicle {
	
	private DriveAPI driveAPI;

	public Vehicle(DriveAPI driveAPI) {
		this.driveAPI = driveAPI;
	} 
	
	public void drive() {
		
		driveAPI.drive(); 
		
	}
	
	

}
