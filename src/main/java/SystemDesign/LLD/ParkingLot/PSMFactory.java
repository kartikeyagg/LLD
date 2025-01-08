package SystemDesign.LLD.ParkingLot;

public class PSMFactory {

	private ParkingSlotManager FourVehicle;
	private ParkingSlotManager TwoVehicleManager;

	private static PSMFactory psmFacotry;

	public static PSMFactory getInstance() {

		if (psmFacotry == null) {
			psmFacotry = new PSMFactory();
		}

		return psmFacotry;
	}

	private PSMFactory() {

		// we can read from a file here ;
		FourVehicle = new FourVehiclePSM(null);
		TwoVehicleManager = new TwoWheelerPSM(null);

	}

	public ParkingSlotManager getPSM(VehicleType vt) {

		switch (vt) {
		case TwoWheeler: {
			return this.TwoVehicleManager;
		}
		case FourWheeler : {
			return this.FourVehicle ;
		}
		default:
			return null ;
		}
		
	}
	

}



















