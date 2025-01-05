package SystemDesign.LLD.ParkingLot;

public class EntranceGate {
	
	private PSMFactory psmFactory ;
	
	private static int vehicleCounter =0  ;
	
	public EntranceGate(PSMFactory psmFactory) {
		this.psmFactory = psmFactory;
	}

	public Vehicle initVehicle(VehicleType vType, PriceStrategy pStr) {
		Vehicle vehicle = new Vehicle(vehicleCounter++, vType, pStr);
		return vehicle;
	}
	public ParkingSpot findSpot(Vehicle v) {
		ParkingSlotManager PSM = this.psmFactory.getPSM(v.getType());
		return PSM.findParkingSpace();
	}
	
	public void parkVehicle(Vehicle v, ParkingSpot ps) {
		
		ParkingSlotManager PSM = this.psmFactory.getPSM(v.getType());
		
		PSM.parkVehicle(v, ps);
		
	}

}

































