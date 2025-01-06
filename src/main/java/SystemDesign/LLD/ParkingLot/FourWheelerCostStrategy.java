package SystemDesign.LLD.ParkingLot;

public class FourWheelerCostStrategy extends CostComposition {

	@Override
	public long getCost(long time, PriceStrategy priceStrategy) {
		// TODO Auto-generated method stub
		switch (priceStrategy) {
		case MinuteWise: {
			
			return (long) Math.ceil(45 * time / (60*1e3));
			
		}
		case Hourly: {
			
			return (long)  Math.ceil(1500 * time / (3600*1e3));
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}

}
