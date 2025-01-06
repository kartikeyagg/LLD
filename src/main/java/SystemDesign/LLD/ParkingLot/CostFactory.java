package SystemDesign.LLD.ParkingLot;

public class CostFactory {
	
	public CostComposition getCostComppsition(VehicleType veType) {

		switch (veType) {
		case TwoWheeler: {

			return new TwoWheelerCostStrategy() ;
		}
		case FourWheeler:{
			return new FourWheelerCostStrategy(); 
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}

	}

}
