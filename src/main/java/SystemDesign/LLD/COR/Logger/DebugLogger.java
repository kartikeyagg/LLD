package SystemDesign.LLD.COR.Logger;

public class DebugLogger extends Logger {

	public DebugLogger(Logger nextLogger) {
		super(nextLogger);
	}
	
	@Override
	public void log(int logLevel,String s) {
		
		if(logLevel!=Logger.DebugLogger) {
			
			super.log(logLevel, s);
			
		}
		
		else {
			
			System.out.println("Debug Log: " + s);
			
		}
		
	}
	
	

}
