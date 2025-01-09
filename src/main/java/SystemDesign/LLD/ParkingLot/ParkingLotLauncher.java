package SystemDesign.LLD.ParkingLot;

public class ParkingLotLauncher {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EntranceGate entranceGate =  new EntranceGate() ;
		
		ExitGate exitGate = new ExitGate() ; 
		
		
		Ticket t1 = entranceGate.parkVehicle(VehicleType.FourWheeler, PriceStrategy.Hourly) ; 
		
		Ticket t2 =entranceGate.parkVehicle(VehicleType.TwoWheeler, PriceStrategy.Hourly) ;
		
		Ticket t3 =entranceGate.parkVehicle(VehicleType.FourWheeler, PriceStrategy.MinuteWise) ;
		
		Ticket t4 =entranceGate.parkVehicle(VehicleType.TwoWheeler, PriceStrategy.MinuteWise) ;

		if (t1 == null || t2 == null || t2 == null || t4 == null) {
			System.out.println("could not find space ");
			System.exit(0);
		}

		Thread.sleep((long) 1e4);

		exitGate.processExit(t1);

		exitGate.processExit(t4);

		exitGate.processExit(t2);

		exitGate.processExit(t3);

	}

}
