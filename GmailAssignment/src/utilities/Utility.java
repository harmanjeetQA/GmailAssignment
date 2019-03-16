package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
/*
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

*/
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.LogStatus;

import frameworkGlobals.BrowserSelection;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import interfaces.GlobalComponents;



public class Utility extends BrowserSelection {
	
	public void takeScreenshot(String SSname) {
			
		File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			String screenShotPath=System.getProperty("user.dir") + "\\LogsAndReports\\Reports_"+extentDate+"\\Screenshots\\";
			FileUtils.copyFile(scrFile, new File(screenShotPath+SSname+".png")); 
			imgeHtmlPath=extentTest.addScreenCapture(screenShotPath+SSname+".png").replace(screenShotPath, "Screenshots\\").replace("file:///", "").replace("<img", "<img width=\"150\" height=\"70\"");                                
      
		} catch (IOException e) {
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Exception occur during take ScreenShot: "+SSname);
		}
		System.out.println("Screenshot has been generated for " +SSname);		    
	}

	public String getCurrentDateTime (String format){
	String timeStamp = new SimpleDateFormat(format).format(new Date());
	return timeStamp;
	}
	
	public static String uniqueNo() {
		return getCurrentDate("HHmmss");
		//new SimpleDateFormat("HHmmss").format(new Date());
		//+Long.toString(System.currentTimeMillis());
	}
		
	public String uniqueString() {
		String string = RandomStringUtils.random(8, true, true);
		return (string.replaceAll("[^A-Za-z]", ""));
	}
	
	public static String getCurrentDate(String dateFormate) {
		return new SimpleDateFormat(dateFormate).format(new Date());
	}
	
	public File getLatestFileFromDir(String dirPath) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}
	
	public boolean goTo(String subURL, String actionInfo)
	{
		getDriver().get(GlobalComponents.appURL+subURL);
		String title = getDriver().getTitle();
		if(title.contains("Not Found")||title.contains("404")||title.contains("Problem loading page")||
				title.contains("Error"))
		{
			extentTest.log(LogStatus.INFO, actionInfo +" can't happen due to error in page loading");
			return false;
		}
		else {
			extentTest.log(LogStatus.INFO, actionInfo +" Page Open successfully");
			return true;
			}						
	}
	
	public String getTitle()
	{
		extentTest.log(LogStatus.INFO, "Title extracted by 'utilities.getTitle()' function");
		return getDriver().getTitle();
	}
}
