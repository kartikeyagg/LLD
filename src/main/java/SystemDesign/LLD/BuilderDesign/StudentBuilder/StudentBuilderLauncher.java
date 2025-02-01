package SystemDesign.LLD.BuilderDesign.StudentBuilder;

public class StudentBuilderLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MBAstudentBuilder mbaStudentBuilder = new MBAstudentBuilder();
		EngineeringStudentBuilder engStudentBuilder = new EngineeringStudentBuilder();
		
		Director dir = new Director(mbaStudentBuilder, engStudentBuilder) ;
		
		Student student1 = dir.getMBAStudent() ;
		Student student2 =  dir.getEngStudent(); 
		
		System.out.println( student1 );
		System.out.println( student2 );
		

	}

}
