package SystemDesign.LLD.CarRentelSystem;

public class Vehicle {
	
	private int id;
	private String VehicleNumber;
	private int kmDriver;
	private Status status;
	
	public Vehicle(int id, String vehicleNumber, int kmDriver, Status status) {
		this.id = id;
		VehicleNumber = vehicleNumber;
		this.kmDriver = kmDriver;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public int getKmDriver() {
		return kmDriver;
	}

	public Status getStatus() {
		return status;
	}
	
}


















