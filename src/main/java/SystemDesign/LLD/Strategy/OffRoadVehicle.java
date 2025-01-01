package SystemDesign.LLD.Strategy;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle() {
		super(new SportyDrive());
	}

}
