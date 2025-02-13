package SystemDesign.LLD.Visitor;

public class GuestVisitor implements VisitorAPI {

	@Override
	public void visit(DeluxeRoom deluxeRoom) {
		// TODO Auto-generated method stub
		
		System.out.println("Guest is visiting Deluxe room ");
		
	}

	@Override
	public void visit(SingleBedRoom singleBedRoom) {
		// TODO Auto-generated method stub
		System.out.println("Guest is visiting Single room ");
		
	}

	@Override
	public void visit(PresidentialSuite presidentialSuite) {
		// TODO Auto-generated method stub
		
		System.out.println("Guest is visiting Presidential suite ");
		
	}

}
