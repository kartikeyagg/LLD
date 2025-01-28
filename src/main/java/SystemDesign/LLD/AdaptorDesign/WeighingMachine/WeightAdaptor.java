package SystemDesign.LLD.AdaptorDesign.WeighingMachine;

public class WeightAdaptor implements WeightAdaptorAPI {
	
	WeighMachineAPI wMachine ;
	

	public WeightAdaptor(WeighMachineAPI wMachine) {
		this.wMachine = wMachine;
	}

	@Override
	public double getWeightInKg() {
		// TODO Auto-generated method stub

		return this.wMachine.getWeightPounds() * 0.45359237;
	}

}
