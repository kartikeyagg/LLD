package SystemDesign.LLD.AdaptorDesign.WeighingMachine;

public class WeightMachineLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeighingMachine wMachinePounds = new WeighingMachine() ;
		
		WeightAdaptor  weightAdaptor = new WeightAdaptor(wMachinePounds) ;
		
		System.out.println(weightAdaptor.getWeightInKg());
		

	}

}
