package SystemDesign.LLD.Visitor;

public class VisitorLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeluxeRoom deluxeRoom = new DeluxeRoom() ;
		
		PresidentialSuite suite = new PresidentialSuite() ;
		
		GuestVisitor guest =  new GuestVisitor() ;
		
		RoomMaitenanceVisitor maintainenceVisitor = new RoomMaitenanceVisitor() ;
		
		deluxeRoom.accept(maintainenceVisitor);
		suite.accept(guest);
		
		deluxeRoom.accept(guest) ;
		
		

	}

}
