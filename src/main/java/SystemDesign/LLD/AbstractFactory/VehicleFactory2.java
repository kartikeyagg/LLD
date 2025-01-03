package SystemDesign.LLD.AbstractFactory;

public class VehicleFactory2 {
	
	public VehicleFactory getVehicleFactory(String vf) {
		
		switch (vf) {
		case "ordinary": {

			return new OrdinaryVehicleFactory();
		}
		case "luxury": {

			return new LuxuryVehicleFactory();
		}
		default:
			return null; 
		}
		
	}

}


