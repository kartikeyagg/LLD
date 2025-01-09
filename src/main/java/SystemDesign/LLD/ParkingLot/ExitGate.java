package SystemDesign.LLD.ParkingLot;

public class ExitGate {
	
	// there for 
	
	private CostFactory costFactory  = new CostFactory() ;
	private PSMFactory psmFactory = PSMFactory.getInstance() ; 
	
	public void processExit(Ticket ticket) {
		
		long currTime = System.currentTimeMillis();
		
		long cost = this.getprice(ticket, currTime- ticket.getEntryTime()) ;
		
		this.unparkVehicle(  ticket.getParkingSpot(),  ticket.getVehicle());
		
		System.out.println("the parking charges are " + cost);
		System.out.println( "currTime: " + currTime );
		System.out.println(ticket);
	}
	
	private long getprice(Ticket ticket , long time) {
		
		CostComposition cc =this.costFactory.getCostComppsition(ticket.getVehicle().getType()) ;
		
		return cc.getCost(time	,ticket.getVehicle().getPs()) ;
		
		
	}
	
	private void unparkVehicle(ParkingSpot ps, Vehicle v ) {
		
		
		ParkingSlotManager psm =  this.psmFactory.getPSM(v.getType()) ;
		psm.unparkVehicle( ps );
		
		
	}

	
	
	
}
