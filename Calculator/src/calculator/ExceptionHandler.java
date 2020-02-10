package calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandler {
	
	Logger logger = Logger.getLogger("Main");

	public void writeLog(String string) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO,string);
		
	}

}
