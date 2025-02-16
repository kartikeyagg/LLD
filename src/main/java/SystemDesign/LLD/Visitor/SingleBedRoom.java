package SystemDesign.LLD.Visitor;

public class SingleBedRoom implements RoomAPI {

	@Override
	public void accept(VisitorAPI visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this) ;
		
	}

}
