package SystemDesign.LLD.FlyWeight;

import java.util.HashMap;

public class RobotManager {
	
	static HashMap<String, RobotAPI> robotCache = new HashMap<String, RobotAPI>(); 
	
	static public RobotAPI createRobot( String robotType ) {
		
		
		if(robotCache.containsKey(robotType)) {
			return robotCache.get(robotType) ;
		}
		
		if(robotType.equals("Humanoid")) {
			
			Sprite sprite = new Sprite() ;
			
			HumanoidRobot humanR = new HumanoidRobot( robotType, sprite );
			
			robotCache.put(robotType, humanR);
			
			return humanR; 
			
		}
		
		else if(robotType.equals("RobotDog")) {
			
			Sprite sprite = new Sprite() ;
			
			RobotDog humanR = new RobotDog( robotType, sprite );
			
			robotCache.put(robotType, humanR);
			
			return humanR; 
			
		}
		
		return null; 
		
		
	}

}
