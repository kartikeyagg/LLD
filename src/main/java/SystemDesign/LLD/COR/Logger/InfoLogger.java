package SystemDesign.LLD.COR.Logger;

public class InfoLogger extends Logger {

	public InfoLogger(Logger nextLogger) {
		super(nextLogger);
	}
	
	@Override
	public void log(int logLevel,String s) {
		
		if(logLevel!=Logger.InfoLogger) {
			
			super.log(logLevel, s);
			
		}
		
		else {
			
			System.out.println("INFO Log: " + s);
			
		}
		
	}
	
	

}
