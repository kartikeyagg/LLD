package SystemDesign.LLD.PrototypeDesignPattern;

public class PrototypeLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker worker1 = new Worker("Jai", 29, 55) ;
		
		System.out.println(worker1);
		
		Worker worker2 =  (Worker) worker1.clone() ;
		
		System.out.println(worker2);
		

	}

}


