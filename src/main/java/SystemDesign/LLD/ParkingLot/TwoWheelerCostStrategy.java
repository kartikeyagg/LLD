package SystemDesign.LLD.ParkingLot;

public class TwoWheelerCostStrategy extends CostComposition {

	@Override
	public long getCost(long time, PriceStrategy priceStrategy) {
		// TODO Auto-generated method stub
		switch (priceStrategy) {
		case MinuteWise: {
			
			return (long) Math.ceil(15 * time / (60*1e3));
			
		}
		case Hourly: {
			
			return (long)  Math.ceil(500 * time / (3600*1e3));
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}

}
