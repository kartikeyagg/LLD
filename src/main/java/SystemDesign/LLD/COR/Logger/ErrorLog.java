package SystemDesign.LLD.COR.Logger;

public class ErrorLog extends Logger {

	public ErrorLog(Logger nextLogger) {
		super(nextLogger);
	}
	
	@Override
	public void log(int logLevel,String s) {
		
		if(logLevel!=Logger.ErrorLogger) {
			
			super.log(logLevel, s);
			
		}
		
		else {
			
			System.out.println("Error Log: " + s);
			
		}
		
	}
	
	

}
