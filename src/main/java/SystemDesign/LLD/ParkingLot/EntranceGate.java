package SystemDesign.LLD.ParkingLot;

public class EntranceGate {

	private PSMFactory psmFactory;

	private static int vehicleCounter = 0;

	public EntranceGate() {
		this.psmFactory = PSMFactory.getInstance();
	}

	public Vehicle initVehicle(VehicleType vType, PriceStrategy pStr) {
		Vehicle vehicle = new Vehicle(vehicleCounter++, vType, pStr);
		return vehicle;
	}

	public ParkingSpot findSpot(Vehicle v) {
		ParkingSlotManager PSM = this.psmFactory.getPSM(v.getType());
		return PSM.findParkingSpace();
	}

	public Ticket parkVehicle(VehicleType vType, PriceStrategy pStr) {

		Vehicle v = this.initVehicle(vType, pStr);

		ParkingSlotManager PSM = this.psmFactory.getPSM(v.getType());

		ParkingSpot ps = this.findSpot(v);

		if (ps == null) {
			System.out.println("no available parking ");
			return null;
		}

		PSM.parkVehicle(v, ps);

		Ticket ticket = new Ticket(System.currentTimeMillis(), v, ps);

		return ticket;

	}

}
