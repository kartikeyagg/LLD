package SystemDesign.LLD.BuilderDesign.StudentBuilder;

public class EngineeringStudentBuilder extends StudentBuilder{

	@Override
	public StudentBuilder setSubjects() {
		// TODO Auto-generated method stub
		
		this.subjects.add("Digital Electronics");
		this.subjects.add("Physics ");
		this.subjects.add("Control System");
		this.subjects.add("MicroProcessor");
		
		
		return this;
	}

}
