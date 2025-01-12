package SystemDesign.LLD.COR.Logger;

public abstract class Logger {
	
	private Logger nextLogger;
	
	public static final int InfoLogger= 1;
	public static final int DebugLogger = 2;
	public static final int ErrorLogger = 3;
	

	public Logger(Logger nextLogger) {
		
		this.nextLogger = nextLogger;
	} 
	
	public void log(int logLevel ,String s) {
		
		if( nextLogger != null ){
			nextLogger.log(logLevel,s) ;
		}
		
	}
	
	
	
	

}
