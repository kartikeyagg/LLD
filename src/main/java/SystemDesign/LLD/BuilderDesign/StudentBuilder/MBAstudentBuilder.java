package SystemDesign.LLD.BuilderDesign.StudentBuilder;

public class MBAstudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		// TODO Auto-generated method stub
		
		this.subjects.add("Economics");
		this.subjects.add("LeaderShip"); 
		this.subjects.add("Accounts") ;
		
		return this;
	}
	
	
	
	

}
