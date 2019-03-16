package frameworkGlobals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import interfaces.ClassObject;
import interfaces.GlobalComponents;

public class BrowserSelection implements ClassObject {
	
	public static boolean driverFlag= true;
	private static WebDriver driver;
	private static WebDriver privateDriver = null;
	public static Capabilities caps;
	public static String imgeHtmlPath;
	public static ExtentTest extentTest;
	public static ExtentReports extentReport = new ExtentReports(
			System.getProperty("user.dir") + "\\LogsAndReports\\Reports_"+extentDate+"\\Reports_" + extentDate + ".html", true);
	

	//@BeforeSuite

	@BeforeClass(enabled = true)
	public  WebDriver initDriver() throws IOException {
		driverFlag = true;		
		extentTest = extentReport.startTest("Browser initialization", "initialization of browser and open browser");
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myProfile = profile.getProfile("iLookProfile");
		
		String browser = GlobalComponents.browser;
		System.out.println("Browser select : "+browser);
		extentTest.log(LogStatus.INFO, "Browser select : "+browser);
		switch (browser) {
		
		case "MF":
			//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+GlobalComponents.mozillaGeckoDriver);
			System.out.println("Mozilla firefox selected");
			driver = new FirefoxDriver(myProfile);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			caps = ((RemoteWebDriver) driver).getCapabilities();
			String browserNameAndVersionMF = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ System.getProperty("os.name");
			System.out.println(browserNameAndVersionMF);
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentTest.log(LogStatus.PASS, "Mozilla firefox open sucessfully");
			break;

		case "GC":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + GlobalComponents.chromeExecutable);
			System.out.println("Google chrome selected");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			caps = ((RemoteWebDriver) driver).getCapabilities();
			String browserNameAndVersionGC = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ System.getProperty("os.name");
			System.out.println(browserNameAndVersionGC);
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentTest.log(LogStatus.PASS, "Google chrome open sucessfully");
			break;

		case "IE":
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + GlobalComponents.ieExecutable);
			System.out.println("Internet explorer selected");
			DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
			dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(dc);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			caps = ((RemoteWebDriver) driver).getCapabilities();
			String browserNameAndVersionIE = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ System.getProperty("os.name");
			System.out.println(browserNameAndVersionIE);
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentTest.log(LogStatus.PASS, "Internet explorer open sucessfully");
			break;

		case "AS":
			System.setProperty("webdriver.safari.driver",
					System.getProperty("user.dir") + "************local path to safari exe***********");
			System.out.println("Apple safari selected");
			driver = new SafariDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentTest.log(LogStatus.PASS, "Apple safari open sucessfully");
			break;

		default:
			//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+GlobalComponents.mozillaGeckoDriver);
			System.out.println("Mozilla firefox selected");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			caps = ((RemoteWebDriver) driver).getCapabilities();
			String browserNameAndVersionDefault = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ System.getProperty("os.name");
			System.out.println(browserNameAndVersionDefault);
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentTest.log(LogStatus.PASS, "Mozilla firefox open sucessfully");
			break;
		}

		
		extentReport.endTest(extentTest);
		extentReport.flush();
		return driver;
	}

	@AfterMethod
	protected void afterMethod(ITestResult result) {
		
    switch (result.getStatus()) {
         
		
		case 1://Pass
			extentTest.log(LogStatus.PASS, "Test passed sucessfully");
			break;
			
		case 2://Fail
			String get_ErrorMessg = result.getThrowable().getMessage();
			String actionInfo=result.getName();
			
			if (get_ErrorMessg.contains("expected")) {
				extentTest.log(LogStatus.FAIL, "BUGGG >> " + get_ErrorMessg);
				utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
				extentTest.log(LogStatus.FAIL, "Screenshort of BuGG :"+ imgeHtmlPath);
				break;
			}
			
			else if (get_ErrorMessg.contains("RUNTIME_ERROR")) {
				extentTest.log(LogStatus.ERROR, "" + get_ErrorMessg);
				extentTest.log(LogStatus.ERROR, "Screenshort of Error :"+ imgeHtmlPath);
				break;
			}
			
			else{
				
				if(get_ErrorMessg.contains("Unable to locate element") || get_ErrorMessg.contains("no_such_element")){
				extentTest.log(LogStatus.ERROR, "RUNTIME ERROR >> " + get_ErrorMessg);
				utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
				extentTest.log(LogStatus.ERROR, "Screenshort of Error :" + imgeHtmlPath);
				break;
				}
				else{
				extentTest.log(LogStatus.ERROR, "RUNTIME ERROR >> " + get_ErrorMessg);	
				break;
				}
			}
		case 3://Skip
			  extentTest.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
			  break;
    }	
            extentReport.endTest(extentTest);
	        extentReport.flush();
	}

	@AfterClass
	public void exit()
	{
		
		driver.quit();
		if(privateDriver != null)
			privateDriver.quit();		

	}
	
	@AfterSuite
	protected void aftersuite() {
		WebDriver driverResult = new FirefoxDriver();
		driverResult.get("file://" + System.getProperty("user.dir") + "\\LogsAndReports\\Reports_"+extentDate+"\\Reports_" + extentDate + ".html");
		System.out.println("Report generated successfully :)");
	}
	
	public void privateBrowser() throws IOException {
		
		extentTest.log(LogStatus.INFO, "'BrowserSelection.privateBrowser()' starts for opening private window");
		String browser = GlobalComponents.browser;
		System.out.println("Browser select : "+browser);
		extentTest.log(LogStatus.INFO, "Browser select : "+browser);
		switch (browser) {
		
		case "GC":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + GlobalComponents.chromeExecutable);
			System.out.println("Google chrome selected for private window");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("-incognito");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			privateDriver=new ChromeDriver(capabilities);
			
			privateDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			privateDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			caps = ((RemoteWebDriver) privateDriver).getCapabilities();
			String browserNameAndVersionGC = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ System.getProperty("os.name");
			System.out.println(browserNameAndVersionGC);
			
			privateDriver.manage().window().maximize();
			extentTest.log(LogStatus.INFO, "Google chrome 'incognito' opens sucessfully");
			break;

		case "IE":
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + GlobalComponents.ieExecutable);
			System.out.println("Internet explorer selected for private window");
			
			DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
			dc.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true); 
			dc.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			
			//dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			privateDriver = new InternetExplorerDriver(dc);
			privateDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			privateDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			caps = ((RemoteWebDriver) privateDriver).getCapabilities();
			String browserNameAndVersionIE = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ System.getProperty("os.name");
			System.out.println(browserNameAndVersionIE);
			
			privateDriver.manage().window().maximize();
			extentTest.log(LogStatus.INFO, "Private Internet explorer opens sucessfully");
			break;

		case "AS":
			System.setProperty("webdriver.safari.driver",
					System.getProperty("user.dir") + "************local path to safari exe***********");
			System.out.println("Apple safari selected");
			
			
			extentTest.log(LogStatus.INFO, "Private Safari opens sucessfully");
			break;

		default:
			//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+GlobalComponents.mozillaGeckoDriver);
			System.out.println("Mozilla firefox selected for private window");
			
			FirefoxProfile firefoxProfile = new FirefoxProfile();    
			firefoxProfile.setPreference("browser.privatebrowsing.autostart", true);
			
			privateDriver = new FirefoxDriver(firefoxProfile);
			privateDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//privateDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			caps = ((RemoteWebDriver) privateDriver).getCapabilities();
			String browserNameAndVersionMF = caps.getBrowserName() + " " + caps.getVersion() + " running on "
					+ System.getProperty("os.name");
			System.out.println(browserNameAndVersionMF);
			
			privateDriver.manage().window().maximize();
			extentTest.log(LogStatus.INFO, "Private Mozilla firefox opens sucessfully");
		}
		
		driverFlag = false;
	}
	
	public static WebDriver getDriver(){
		if (driverFlag) {
			return driver;
		} else {
			if(privateDriver != null)
				return privateDriver;
			else
				return driver;
		}
	}
	
}