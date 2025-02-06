package SystemDesign.LLD.FlyWeight;

public class FlyWeightLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HumanoidRobot humanR1 = (HumanoidRobot) RobotManager.createRobot("Humanoid") ;
		
		humanR1.display(43, 75);
		
		HumanoidRobot humanR2 = (HumanoidRobot) RobotManager.createRobot("Humanoid") ;
		
		humanR2.display(89,17);


	}

}
