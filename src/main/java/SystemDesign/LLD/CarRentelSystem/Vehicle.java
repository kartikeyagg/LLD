package SystemDesign.LLD.CarRentelSystem;

public class Vehicle {
	
	private int id;
	private String VehicleNumber;
	private int kmDriven;
	private Status status;
	private int costPerkm; 
	
	public Vehicle(int id, String vehicleNumber, int kmDriver, Status status , int costPerKm) {
		this.id = id;
		VehicleNumber = vehicleNumber;
		this.kmDriven = kmDriver;
		this.status = status;
		this.costPerkm =  costPerKm;
	}

	public int getId() { 
		return id;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public int getKmDriven() {
		return kmDriven;
	}

	public Status getStatus() {
		return status;
	}

	public int getCostPerkm() {
		return costPerkm;
	}
	
	
	
}


















