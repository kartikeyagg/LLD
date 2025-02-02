package SystemDesign.LLD.BuilderDesign.StudentBuilder;


import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder builder){
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.subjects = builder.subjects;
    }
    

    public int getRollNumber() {
		return rollNumber;
	}

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFatherName() {
		return fatherName;
	}


	public String getMotherName() {
		return motherName;
	}


	public List<String> getSubjects() {
		return subjects;
	}

	

	public String toString(){
        return ""+ " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects;
    }
}
