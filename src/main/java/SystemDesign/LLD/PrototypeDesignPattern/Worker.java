package SystemDesign.LLD.PrototypeDesignPattern;

public class Worker implements Prototype {
	
	private String name;
	private int age;
	private int id;
	
	public Worker(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}




	public Prototype clone() {
		
		Worker worker = new Worker(this.name, this.age, this.id) ;
		
		return worker;
		
	}




	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	

}
