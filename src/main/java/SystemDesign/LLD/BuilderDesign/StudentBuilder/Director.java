package SystemDesign.LLD.BuilderDesign.StudentBuilder;

public class Director {
	
	private MBAstudentBuilder mbaStudentBuilder ;
	private EngineeringStudentBuilder engineeringStudentBuilder;
	
	public Director(MBAstudentBuilder mbaStudentBuilder, EngineeringStudentBuilder engineeringStudentBuilder) {
		this.mbaStudentBuilder = mbaStudentBuilder;
		this.engineeringStudentBuilder = engineeringStudentBuilder;
	}
	
	
	public Student getMBAStudent() {
		return this.mbaStudentBuilder.setAge(29).setFatherName("R").setName("K").setRollNumber(21).setSubjects().build();
	}
	
	public Student getEngStudent() {
		return this.engineeringStudentBuilder.setAge(23).setFatherName("R").setName("K").setSubjects().setRollNumber(64).build();
	}
	
	

}
