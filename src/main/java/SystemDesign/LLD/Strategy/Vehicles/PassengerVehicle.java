package SystemDesign.LLD.Strategy.Vehicles;

import SystemDesign.LLD.Strategy.Drive.NormalDrive;

public class PassengerVehicle extends Vehicle {

	public PassengerVehicle(  ) {
		
		super(new NormalDrive()) ;
		
		
	}
	
	

}
