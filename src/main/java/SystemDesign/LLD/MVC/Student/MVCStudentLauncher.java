package SystemDesign.LLD.MVC.Student;

public class MVCStudentLauncher {

	public static void main(String[] args) {
		
		StudentModel student1 = new StudentModel(47, "Tim"); // generally taken out from DB;
		StudentView studentView = new StudentView();
		
		StudentController studentController = new StudentController(student1, studentView);
		
		studentController.updateView();
		studentController.setName("John");
		studentController.updateView(); 
		
	}
	
}
