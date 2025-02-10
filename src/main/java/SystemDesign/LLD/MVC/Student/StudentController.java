package SystemDesign.LLD.MVC.Student;

public class StudentController {
	
	private StudentModel studentModel ;
	private StudentView studentView;
	
	public StudentController(StudentModel studentModel, StudentView studentView) {
		super();
		this.studentModel = studentModel;
		this.studentView = studentView;
	} 
	
	public int getRollNumber() {
//	return rollNumber;
		return studentModel.getRollNumber() ;
	}

	public void setRollNumber(int rollNumber) {
		studentModel.setRollNumber(rollNumber);
	}

	public String getName() {
		
		return studentModel.getName() ;
	}

	public void setName(String name) {
		studentModel.setName(name);
	}
		
	public void updateView() {
		
		studentView.printDetails(getRollNumber(), getName()); 
		
	}
	
	

}
