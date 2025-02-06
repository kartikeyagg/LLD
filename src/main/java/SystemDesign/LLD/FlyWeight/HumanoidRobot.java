package SystemDesign.LLD.FlyWeight;

public class HumanoidRobot implements RobotAPI {
	
	
	private String type ;
	private Sprite sprite;
	
	
	
	
	public HumanoidRobot(String type, Sprite sprite) {
		super();
		this.type = type;
		this.sprite = sprite;
	}


	@Override
	public void display(int x, int y) {
		// TODO Auto-generated method stub
		
		System.out.println(  type + " " + sprite + " " + x + " " + y );
		
	}


	public String getType() {
		return type;
	}


	public Sprite getSprite() {
		return sprite;
	}
	
	
	

}
