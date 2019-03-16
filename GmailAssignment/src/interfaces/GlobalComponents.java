/**
 * 
 */
package interfaces;

/** This interface contains global variables, address, and properties that is being used in the system.
 * @author Haridner
 * @version V2.0
 * 
 */
public interface GlobalComponents {
	
	// Ssystem's global variables and data.
	public String browser = "GC";
	public String appURL = "";
	
	
	
	// Property file address
	public String globalData = "AppProperties/GlobalData.properties";
	public String propertyFile = "AppProperties/EquitySimProp.properties";
	
	// Browser executables address
	public String mozillaGeckoDriver = "/BrowserExecutables/geckodriver-v0.11.1-win64.exe";
	public String chromeExecutable = "/BrowserExecutables/chromedriver.exe";
	public String ieExecutable = "/BrowserExecutables/IEDriverServer_Win32_2.53.1.exe";
	public String msEdgeExecutable = "";
	public String safariExrcutable = "";
	}