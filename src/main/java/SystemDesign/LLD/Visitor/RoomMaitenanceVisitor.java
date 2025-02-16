package SystemDesign.LLD.Visitor;

public class RoomMaitenanceVisitor implements VisitorAPI {

	@Override
	public void visit(DeluxeRoom deluxeRoom) {
		// TODO Auto-generated method stub
		
		System.out.println(" RMVisitor visiting delux Room ");
		
	}

	@Override
	public void visit(SingleBedRoom singleBedRoom) {
		// TODO Auto-generated method stub
		System.out.println(" RMVisitor visiting single Room ");
		
	}

	@Override
	public void visit(PresidentialSuite presidentialSuite) {
		// TODO Auto-generated method stub
		System.out.println(" RMVisitor visiting presidential suite ");
		
	}

}
