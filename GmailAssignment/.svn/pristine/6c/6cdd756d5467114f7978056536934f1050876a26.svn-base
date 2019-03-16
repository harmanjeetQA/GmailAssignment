package utilities;

import java.util.Date;

import org.apache.log4j.Logger;

public class SetLogs {

	// Initialize Log4j logs
	  Date currentDate = new Date();
	private   Logger Log = Logger.getLogger(SetLogs.class.getName());

	public   void startTest(String testCaseName) {
		// To print log for the starting of the test case
		Log.info(" " + testCaseName + "Start date and time" + currentDate.toString() + "");

	}

	public   void endTest(String testCaseName) {
		// To print log for the ending of the test case
		Log.info("" + testCaseName + "End date and time:" + currentDate.toString() + "");

	}

	public   void info(String message) {
		// To print informational message that highlights the progress of the
		// execution test new changes
		Log.info(message);

	}

	public   void warn(String message) {
		// To print information regarding faulty and unexpected system behavior.
		Log.warn(message);

	}

	public   void error(String message) {
		// To print error message that might allow system to continue
		Log.error(message);

	}

	public   void fatal(String message) {
		// To print system critical information which are causing the
		// application to crash
		Log.fatal(message);

	}

	public   void debug(String message) {
		// To print the debugging information and is helpful in debugging stage.
		Log.debug(message);
	}
}