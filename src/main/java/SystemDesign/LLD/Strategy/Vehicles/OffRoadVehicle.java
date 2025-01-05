package SystemDesign.LLD.Strategy.Vehicles;

import SystemDesign.LLD.Strategy.Drive.SportyDrive;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle() {
		super(new SportyDrive());
	}

}
