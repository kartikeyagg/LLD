package SystemDesign.LLD.ParkingLot;

public class ExitGate {
	
	// there for 
	
	private CostFactory costFactory  = new CostFactory() ;
	
	public void processExit(Ticket ticket) {
		
		long cost = this.getprice(ticket, System.currentTimeMillis()- ticket.getEntryTime()) ;
		
		
	}
	
	private long getprice(Ticket ticket , long time) {
		
		CostComposition cc =this.costFactory.getCostComppsition(ticket.getVehicle().getType()) ;
		
		return cc.getCost(time	,ticket.getVehicle().getPs()) ;
		
		
	}
	
	private void removeVehicle(Vehicle v) {
		
		
	}

	
	
	
}
