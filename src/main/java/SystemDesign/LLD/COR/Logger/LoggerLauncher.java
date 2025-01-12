package SystemDesign.LLD.COR.Logger;

public class LoggerLauncher {
	
	public static void main(String[] args) {
		
		Logger logger = new InfoLogger(new DebugLogger( new ErrorLog(null))) ; 
		
		
		logger.log(Logger.ErrorLogger, "Exception 104");
		logger.log(Logger.DebugLogger, "Debug String");
		logger.log(Logger.InfoLogger, "Info String");
		
		
	}

}
