package SystemDesign.LLD.ParkingLot;

public class PSMFactory {
	
	// make this singleton instead;
	
	private ParkingSlotManager FourVehicle ;
	private ParkingSlotManager TwoVehicleManager;

	public PSMFactory() {
		
		// we can read from a file here  ;
		FourVehicle  = new FourVehiclePSM(null) ;
		TwoVehicleManager = new TwoWheelerPSM(null);	
		
	}
	
	
	public ParkingSlotManager getPSM(VehicleType vt) {
		
		switch (vt) {
		case TwoWheeler : {
			return this.TwoVehicleManager ;
		}
		case FourWheeler : {
			return this.FourVehicle ;
		}
		default:
			return null ;
		}
		
	}
	

}



















