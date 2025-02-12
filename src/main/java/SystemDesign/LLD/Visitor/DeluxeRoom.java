package SystemDesign.LLD.Visitor;

public class DeluxeRoom implements	RoomAPI {

	@Override
	public void accept(VisitorAPI visitor) {
		// TODO Auto-generated method stub
		
		visitor.visit(this) ;
		
	}
	
	

}
